<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<form action = "/addNewProduct" method ="post">
		Product Name: <input type ="text" name="name"/><br><br>
		Product Price: <input type = "text" name = "price"/><br>
		<input type = submit value = "submit"/>
	</form>
</body>
</html>