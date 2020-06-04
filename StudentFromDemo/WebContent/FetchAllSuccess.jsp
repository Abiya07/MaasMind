<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="P1.FetchAllBean" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<FetchAllBean> ls = (List)request.getAttribute("list");
Iterator <FetchAllBean> it = ls.iterator();%>
<p>
<table border=2 align="center">
<tr>
<th>ID</th>
<th>NAME</th>
<th>AGE</th>
<th>EMAIL</th>
<th>PHONENUMBER</th>
<th>DOJ</th>
<th colspan=2>ACTION</th>
<% while(it.hasNext()){
	FetchAllBean fb = (FetchAllBean)it.next();
	%>	
<tr>
<tr align="center">
<td><%= fb.getId() %>
<td><%= fb.getName() %></td>
<td><%= fb.getAge() %></td>
<td><%= fb.getEmail() %></td>
<td><%= fb.getPhonenumber() %></td>
<td><%= fb.getDoj() %></td>
<td><a href="UpdateInfo.jsp?id=<%= fb.getId() %>&name=<%= fb.getName()%>&age=<%= fb.getAge()%>&email=<%=fb.getEmail()%>&phonenumber=<%=fb.getPhonenumber()%>&doj=<%=fb.getDoj()%>">Update</a></td>
<td><a href="/StudentFromDemo/DeleteServlet?name=<%=fb.getName() %>">Delete</a></td>
</tr>
<% } %>
</table>
<p align="center">
Go to Main Page<a href="StudentInfo.jsp">Click Here</a><br/>
Insert New Record<a href="StudentRegisterForm.jsp">Insert Here</a><br/>
</body>
</html>