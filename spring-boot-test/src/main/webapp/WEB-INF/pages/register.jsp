<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<form action = "/register" method ="post">
		Username: <input type ="text" name="uname"/><br><br>
		Password: <input type = "password" name = "pwd"/><br>
		<input type = submit value = "submit"/>
	</form>
</body>
</html>