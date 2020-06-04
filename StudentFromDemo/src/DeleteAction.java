import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteAction {
	public boolean deleteDate(String name){
		boolean status = false;
		Connection con = null;
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Gentle","Gentle");
		Statement st = con.createStatement();
		int i = st.executeUpdate("delete from studentdetail where name='"+name+"'");
		System.out.print(i);
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
