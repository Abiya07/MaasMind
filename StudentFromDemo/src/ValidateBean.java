import java.util.HashMap;


public class ValidateBean {
	private String name;
	private String age;
	private String email;
	private String phonenumber;
	private String doj;
	private HashMap<String,String> errormap;
	private int errorcount=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap<String, String> getErrormap() {
		return errormap;
	}
	public void setErrormap(HashMap<String, String> errormap) {
		this.errormap = errormap;
	}
	public int getErrorcount() {
		return errorcount;
	}
	public void setErrorcount(int errorcount) {
		this.errorcount = errorcount;
	}
	public int Validate(){
		HashMap<String,String> err = new HashMap<String,String>();
		if(name==null || name==""){
			err.put("namekey", "*name can't be null");
			errorcount++;
			setErrormap(err);
			System.out.println("null");
		}
		else if(!name.matches("[A-Z a-z]*")){
		err.put("namekey", "*Invalid name");
		errorcount++;
		setErrormap(err);
		System.out.println("Invalid name");
		}
		if(age==null || age==""){
			err.put("agekey", "*age can't be null");
			errorcount++;
			setErrormap(err);
			System.out.println("null");
		}
		else if(!age.matches("[0-9]*")){
			err.put("agekey", "*Invalid age");
			errorcount++;
			setErrormap(err);
			System.out.println("Invalid age");
		}
		if(email==null || email==""){
			err.put("emailkey", "*email can't be null");
			errorcount++;
			setErrormap(err);
			System.out.println("null");
		}
		else if(!email.matches("^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)[a-zA-z]{2,7}$*")){
			err.put("emailkey", "*Invalid email");
			errorcount++;
			setErrormap(err);
			System.out.println("Invalid email");
		}
		if(phonenumber==null || phonenumber==""){
			err.put("phonenumberkey", "*phonenumber can't be null");
			errorcount++;
			setErrormap(err);
			System.out.println("null");
		}
		else if(!phonenumber.matches("(0/91)?[7-9][0-9]{9}")){
			err.put("phonenumberkey", "*Invalid phonenumber");
			errorcount++;
			setErrormap(err);
			System.out.println("Invalid phonenumber");
		}
		if(doj==null || doj==""){
			err.put("dojkey", "*doj can't be null");
			errorcount++;
			setErrormap(err);
			System.out.println("null");
		}
		else if(!doj.matches("^([0-9]{2})-([a-zA-z]{3})-([0-9]{2})$*")){
			err.put("dojkey", "*Invalid doj");
			errorcount++;
			setErrormap(err);
			System.out.println("Invalid doj");
		}
		
		return errorcount;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	
}


