import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import P1.FetchAllBean;

public class FetchAllAction {
	public List<FetchAllBean> FetchAllData(){
		Connection con=null;
		ResultSet rs = null;
		List<FetchAllBean> ls = new ArrayList<FetchAllBean>();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Gentle","Gentle");
			Statement st = con.createStatement();
			rs = st.executeQuery("select * from studentdetail");
			while(rs.next()){
				FetchAllBean ab = new FetchAllBean();
				String id=rs.getString(1);
				String name=rs.getString(2);
				String age=rs.getString(3);
				String email=rs.getString(4);
				String phonenumber=rs.getString(5);
				Date d = rs.getDate(6);
				SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy");
				String date=sd.format(d);
				ab.setId(id);
				ab.setName(name);
				ab.setAge(age);
				ab.setEmail(email);
				ab.setPhonenumber(phonenumber);
				ab.setDoj(date);
				ls.add(ab);
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return ls;
		
	}

}
