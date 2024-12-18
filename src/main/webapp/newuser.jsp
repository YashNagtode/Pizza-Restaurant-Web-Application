<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
    <link rel="stylesheet" href="css/site.css">
</head>
<body>

    <h2 class="header">Registration</h2>

    <sf:form modelAttribute="cust" action="register">
        <label for="name">Full Name:</label><br>
		<sf:input path="name" placeholder="Enter your full name"/>
		<sf:errors path="name" cssClass="error" /><br><br>
		
		 <label for="password">Password:</label><br>
        <sf:password path="password" placeholder="Create a password"/>
        <sf:errors path="password" cssClass="error" /><br><br>
        
        <label for="mobile">Mobile Number:</label><br>
        <sf:input path="mobile" placeholder="Enter your mobile number"/>
        <sf:errors path="mobile" cssClass="error" /><br><br>
        
        <label for="address">Address:</label><br>
        <sf:textarea path="address" placeholder="Enter your address" rows="4" cols="50"/>
        <sf:errors path="address" cssClass="error" /><br><br>
		
        <label for="email">Email:</label><br>
        <sf:input path="email" placeholder="Enter your email"/>
        <sf:errors path="email" cssClass="error" /><br><br>


        <input type="submit" value="Register"> <br/><br/>

	    <sf:errors path="*" cssClass="error" />
    </sf:form>
	<p>${message}</p>
    <p>Already have an account? <a href="index">Login here</a></p>
</body>
</html>
