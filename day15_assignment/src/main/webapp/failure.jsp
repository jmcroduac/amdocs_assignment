<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log In Failed</title>
</head>
<body>
	<h2>Login Failed. Please try again.</h2>
	<c:out value="${uname}"/>
	<c:out value="${pwd}"/>
</body>
</html>