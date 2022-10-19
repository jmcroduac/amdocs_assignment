<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${msg}</h1>
<a href="${pageContext.request.contextPath}/getUser?userId=123">get user details</a><br><br>

<a href="${pageContext.request.contextPath}/getName/Mark">get user details</a>

	<form action="${pageContext.request.contextPath}/save" method="post">
		UserName: <input type="text" name ="uname" id ="uname"/> <br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>