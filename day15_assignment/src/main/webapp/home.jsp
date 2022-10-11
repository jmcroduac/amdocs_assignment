<%@ page language="java" import="java.util.HashMap" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		HashMap<String, String> loginCreds = (HashMap<String,String>) request.getAttribute("loginCreds");
	%>
	<table>	
		<tr>
			<th><%out.println("<h2>Username</h2>");%></th>
			<th><%out.println("<h2>Password</h2>");%></th>
		</tr>
		<%
			for (HashMap.Entry<String, String> entry : loginCreds.entrySet()) {
		%>
				<tr>
					<td><%out.println(entry.getKey());%></td>
					<td><%out.println(entry.getValue());%></td>
				</tr>
		<%    	
			}
		%>
	</table>	
</body>
</html>