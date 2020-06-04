<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fetch Student Details </title>
</head>
<body>
	<h3>Student Details</h3>
	<form action="FetchServlet" method="post">
	Name:<input type="text" name="name"/><br/>
	<input type="submit" value="Fetch"/>
	</form>

</body>
</html>