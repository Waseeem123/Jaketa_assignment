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
		String uname = (String)session.getAttribute("name");
		if(uname == null) {
			request.getRequestDispatcher("login.jsp");
		}
	%>
	<h1>WELCOME TO DASH BOARD</h1>
	<a href="getuser">Your Profile</a>
	<a href="logout">Logout</a>
	
</body>
</html>	