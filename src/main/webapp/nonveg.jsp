<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
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
	<p>
	
	<h2 align="center">Online Pizza</h2>
	
	<div align="center" style="background-color: aqua; font-size: 20px">
	<a href="veg" >Veg</a> &nbsp;&nbsp;
	<a href="nonveg">Non-Veg</a>
	</div>

	<div   style="background-color:teal; padding-left: 350px"">
	<form action="name" method="get">
		<c:forEach var="p" items="${nonveglist}">
			<input type="radio" name="nonveg" value="${p}"/> ${p}<br>
		</c:forEach>
		<input type="submit" value="show pizza" />
	</form>
	
	</div>

</body>
</html>