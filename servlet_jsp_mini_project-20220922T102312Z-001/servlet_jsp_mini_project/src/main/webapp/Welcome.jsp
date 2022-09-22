<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">



.bimg
{
	 display:flex;
	 align-items:center;
	 width:500px;
	 margin:auto;
	 border-radius:30px 5px 30px 5px;
	 background-color:rgb(198,114,245);
	 height:50vh;	
	 box-shadow: 2px 2px 5px black; 
}


h1
{
	display:flex;
	padding:50px;
	background-color:activeborder; 
	color: white;
	
}
.btn
{
  	
   border-radius:20px; 
   border: none;
   width:100px;
   background-color:black;
   margin: auto;
  
}
a
{
  text-decoration: none;
  color:white;
}


</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h1>WELCOME</h1>
   	
   <div class="bimg">
   		
				<button class="btn"> <h2><a href="User_Registration.jsp"> Register</a> </h2>      </button>	 
				
				<button class="btn"> <h2><a href="login.jsp">Login</a> </h2>                     </button>			  
   </div>
</body>
</html>