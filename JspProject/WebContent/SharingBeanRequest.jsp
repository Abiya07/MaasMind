<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="sharing" class="p1.SharingBean" scope="page"/>
	<jsp:setProperty name="sharing" property="*"/>
	<b>Staff Name</b>
	<jsp:getProperty name="sharing" property="name"/><br/>
	<b>Department</b>
	<jsp:getProperty name="sharing" property="dept"/>
	<jsp:include page="SharingBean1.jsp"/>
</body>
</html>