<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>Include Page</b><br/>
	<% String fgColor = request.getParameter("fgColor");
	   String bgColor = request.getParameter("bgColor");
	   out.println("fgColor:"+fgColor);
	   out.println("bgColor:"+bgColor);
	   %>  
</body>
</html>