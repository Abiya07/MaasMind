import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FetchAction {
	public ResultSet FetchData(String name){
		Connection con=null;
		ResultSet rs = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Gentle","Gentle");
			Statement st = con.createStatement();
			rs = st.executeQuery("select * from studentdetail where name='"+name+"'");	
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rs;
		
	}

}
