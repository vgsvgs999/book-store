<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddBook</title>
</head>
<body>
<form action="savebook" method="post">
Book ID : <input type="number" name="bid"><br><br>
Book Name : <input type="text" name="bname"><br><br>
Author : <input type="text" name="bauthor"><br><br>
Price : <input type="number" name="bprice"><br><br>
Pages : <input type="number" name="bpages"><br><br>
<input type="submit" value="save">
</form>
</body>
</html>