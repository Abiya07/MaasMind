import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ValidateAction {
	public boolean validateData(ValidateBean sb){
		boolean status=false;
		Connection con=null;
		
		String name=sb.getName();
		String age=sb.getAge();
		String email=sb.getEmail();
		String phonenumber=sb.getPhonenumber();
		String doj=sb.getDoj();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Gentle","Gentle");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from studentdetail where name='"+name+"'");	
			if(rs.next()){
				status=false;
		}else{
			int i=st.executeUpdate("insert into studentdetail values(studentid.NEXTVAL,'"+name+"','"+age+"','"+email+"','"+phonenumber+"','"+doj+"')");
			if(i>0){
				status=true;
			}
		}
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return status;
	}
		
	}


