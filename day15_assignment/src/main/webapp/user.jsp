<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Page</title>
</head>
<body>
		<h1>Successful user log-in!</h1>
		<h2>Here are your user details: </h2>
		Username: <c:out value="${uname}"/><br>
		Password: <c:out value="${pwd}"/><br>
		User Type: <c:out value="User"/>
</body>
</html>