<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Reading Two request Parameter</h1>
<ul>
	<li>UserName:<%=request.getParameter("t1") %>
	<li>Password:<%=request.getParameter("t2") %>
</ul>	
</body>
</html>