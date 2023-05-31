<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body>
	<h1>ENTER YOUR DETAILS</h1>
	<form action="save" method="post">
		ID : <input type="number" name="id"><br>
		<br> Name : <input type="text" name="name"><br>
		<br> Email : <input type="email" name="email"><br>
		<br> Password : <input type="password" name="password"><br>
		<br> Address : <input type="text" name="address"><br>
		<br> PinCode : <input type="number" name="pincode"><br>
		<br> Phone : <input type="number" name="phone"><br>
		<br> <input type="submit" value="register">
	</form>
</body>
</html>