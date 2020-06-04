import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginAction {
	public boolean LoginData(String username,String password){
		boolean status = false;
		Connection con=null;
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Gentle","Gentle");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select*from userdetails where username='"+username+"'and password='"+password+"'");
			if(rs.next()){
					status = true;
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return status;
	}
}
