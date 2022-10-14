<%@ page language="java" import="java.util.HashMap" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>
</head>
<body>
		<h1>Successful admin log-in!</h1>
		<table> 
			<tr> 
				<th><c:out value="Log-in ID" /></th> 
				<th><c:out value="Username"/> </th> 
				<th><c:out value="Password"/> </th>
			</tr> 
			<c:forEach var="user" items="${userlist}"> 
				<tr> 
					<td><c:out value="${user.login_id}"/></td> 
					<td><c:out value="${user.userName}"/> </td> 
					<td><c:out value="${user.password}"/> </td>
				</tr> 
			</c:forEach> 
		</table>
</body>
</html>