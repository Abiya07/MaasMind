<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ValidateServlet">
<%
String name=null;
String age=null;
String email=null;
String phonenumber=null;
String doj=null;
HashMap<String,String> error = (HashMap)request.getAttribute("errmap");

System.out.println("err = " +error);
if(error!=null){
	name=error.get("namekey");
	age=error.get("agekey");
	email=error.get("emailkey");
	phonenumber=error.get("phonenumberkey");
	doj=error.get("dojkey");
}
	if(name!=null){%>
	Name:<input type="text" name="name"/><label style="color:red"><%=name%></label><br/>
	<%}else{ %>
	Name:<input type="text" name="name"/><br/>
	<%}if(age!=null){%>
	Age:<input type="text" name="age"/><label style="color:red"><%=age%></label><br/>
	<%}else{ %>
	Age:<input type="text" name="age"/><br/>
	<%} if(email!=null){%>
	Email:<input type="text" name="email"/><label style="color:red"><%=email%></label><br/>
	<%}else{ %>
	Email:<input type="text" name="email"/><br/>
	<%}if(phonenumber!=null){%>
	Phonenumber:<input type="text" name="phonenumber"/><label style="color:red"><%=phonenumber%></label><br/>
	<%}else{ %>
	Phonenumber:<input type="text" name="phonenumber"/><br/>
	<%}if(doj!=null){%>
	Date of join:<input type="text" name="doj"/><label style="color:red"><%=doj%></label><br/>
	<%}else{ %>
	Date of Join:<input type="text" name="doj"/><br/>
	<%}%>

<input type="submit" value="submit" /><br/>
</form>

</body>
</html>