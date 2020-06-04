<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>String Bean</title>
</head>
<body>
	<jsp:useBean id="stringbean" class="p1.StringBean" scope="page"/>
	Initial Value:
	<jsp:getProperty name="stringbean" property="message"/><br/>
	<jsp:setProperty name="stringbean" property="message" value="success"/>
	After setting value:
	<jsp:getProperty name="stringbean" property="message"/>
</body>
</html>