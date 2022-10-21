<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<form action = "/listAllProducts">
		<h2>View all products:</h2>
		<input type = submit value = "View"/><br><br><br><br>
	</form>
	<form action = "/addNewProduct" method ="post">
		<h2>Add new product:</h2>
		Product Name: <input type ="text" name="name"/><br><br>
		Product Price: <input type = "text" name = "price"/><br>
		<input type = submit value = "Add"/><br><br><br><br>
	</form>
	<form action = "/findProduct" method ="post">
		<h2>Find product:</h2>
		Product ID: <input type ="text" name="id"/><br><br>
		<input type = submit value = "Find"/><br><br><br><br>
	</form>
	<form action = "/deleteProduct" method ="post">
		<h2>Delete product:</h2>
		Product ID: <input type ="text" name="id"/><br><br>
		<input type = submit value = "Delete"/><br><br><br><br>
	</form>
</body>
</html>