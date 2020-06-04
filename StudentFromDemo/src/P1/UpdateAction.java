package P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateAction {
	public boolean updateData(UpdateBean sb){
		boolean status=false;
		Connection con=null;
		String id=sb.getId();
		String name=sb.getName();
		String age=sb.getAge();
		String email=sb.getEmail();
		String phonenumber=sb.getPhonenumber();
		String doj=sb.getDoj();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Gentle","Gentle");
			Statement st = con.createStatement();			
			int i=st.executeUpdate("update studentdetail set name='"+name+"',age='"+age+"',email='"+email+"',phonenumber='"+phonenumber+"',doj='"+doj+"'where studentid='"+id+"'");
			if(i>0){
				status=true;
			}
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return status;
	}

}
