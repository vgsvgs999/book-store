<%@page import="com.js.dto.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<h1>Update Your Data</h1>
<% Book b = (Book)request.getAttribute("book"); %>

<form action="edit" method="get">
Book ID : <input type="number" name="bid" value="<%= b.getId() %>" readonly = "readonly"><br><br>
Book Name : <input type="text" name="bname" value="<%= b.getBook_name() %>"><br><br>
Author : <input type="text" name="bauthor" value="<%= b.getAuthor_name() %>"><br><br>
Price : <input type="number" name="bprice" value="<%= b.getPrice() %>"><br><br>
Pages : <input type="number" name="bpages" value="<%= b.getNo_of_pages() %>"><br><br>
<input type="submit" value="update">
</form>

</body>
</html>