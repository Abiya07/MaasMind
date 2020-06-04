import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import P1.RegisterBean;


public class RegisterAction {
	public boolean registerData(RegisterBean rb){
		boolean status = false;
		Connection con = null;
		//retrive the data from bean object 
		String firstname = rb.getFirstname();
		String lastname = rb.getLastname();
		String username = rb.getUsername();
		String password = rb.getPassword();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Gentle","Gentle");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from userdetails where username = '"+username+"' and password = '"+password+"'");//if user already regiestered the name,they can't store again the details into the table
			//check the data base if already present the data it return true so status return false 
			if(rs.next()){
				status = false;
			}else{
				int i = st.executeUpdate("insert into userdetails values('"+firstname+"','"+lastname+"','"+username+"','"+password+"')");
				//int return interger value +1,-1
					if(i>0){
						status = true;
					}
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		return status;
	}
}
