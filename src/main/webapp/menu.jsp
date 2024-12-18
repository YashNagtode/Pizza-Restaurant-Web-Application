<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pizza Menu</title>
</head>
<body>
	<p>
	<div align="right">
		<a href="showcart">Show Cart</a> &nbsp;<a
			href="index">Sign out</a>
		</div>
		Welcome, ${sessionScope.user}! 
	

	</p>
	<h2 align="center">Online Pizza</h2>
	
	<div align="center" style="background-color: aqua; font-size: 20px">
	
	
	<a href="veg?type=veg" >Veg</a> &nbsp;&nbsp;
	<a href="nonveg?type=nonveg">NonVeg</a>
	
	
	</div>
</body>
</html>