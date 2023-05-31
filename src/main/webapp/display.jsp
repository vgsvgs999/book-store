<%@page import="com.js.dto.Book"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display</title>
</head>
<body>
<h1 style="color: orange">BOOK TABLE</h1>
<table border="5px">
<tr>
<th>ID</th>
<th>BOOK</th>
<th>AUTHOR</th>
<th>PRICE</th>
<th>PAGES</th>
<th>DELETE</th>
<th>UPDATE</th>

</tr>
<% ArrayList<Book> books = (ArrayList)request.getAttribute("data"); %>
<% for(Book b : books){ %>
<tr>
<td><%= b.getId() %></td>
<td><%= b.getBook_name() %></td>
<td><%= b.getAuthor_name() %></td>
<td><%= b.getPrice() %></td>
<td><%= b.getNo_of_pages() %></td>
<td><a href= "delete?id=<%= b.getId()%>">delete</a></td>
<td><a href= "update?id=<%= b.getId()%>">edit</a></td>
</tr>
<%}%>
</table>
</body>
</html>