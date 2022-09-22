<%@page import="servlet_jsp_mini_project.User_Dto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	User_Dto u = (User_Dto) request.getAttribute("user");
	%>
	<h1>User Details</h1>
	<table border="2px">
	
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email id</th>
			<th>Phone Number</th>
		</tr>
		<tr>
			<td><%=u.getId()%></td>
			<td><%=u.getName()%></td>
			<td><%=u.getEmail()%></td>
			<td><%=u.getNumber()%></td>
		</tr>
	</table>
	<br><br>
	<h2><a href="logout">Logout</a></h2>
	
</body>
</html>