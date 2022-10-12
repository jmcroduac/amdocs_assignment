<%@ page language="java" import="java.util.HashMap" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table> 
			<tr> 
				<th><c:out value="Course ID" /></th> 
				<th><c:out value="Course Name"/> </th> 
				<th><c:out value="Duration (Weeks)"/> </th>
				<th><c:out value="Course Fee"/> </th>
			</tr> 
			<c:forEach var="course" items="${courseTable}"> 
				<tr> 
					<td><c:out value="${course.courseId}"/></td> 
					<td><c:out value="${course.courseName}"/> </td> 
					<td><c:out value="${course.duration}"/> </td>
					<td><c:out value="${course.courseFee}"/> </td>
				</tr> 
			</c:forEach> 
		</table>
</body>
</html>