<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
</head>
<body>
	<h1>Log In</h1>
	<form action="loginCheck" method="post">
		Username: <input type="text" name="uname" id="user"/><br><br>
		Password: <input type="password" name="pwd" id="pass"/><br><br>		
		<input type = "submit" value="Log In"/>
		<a href="register.html">
			<input type= "button" value="Register">
		</a>
		
	</form>
</body>
</html>