<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Products List</title>
</head>
<body>
<table>
	<thead><h2>Products List</h2></thead>
	<tr>
		<th>Product ID</th>
		<th>Product Name</th>
		<th>Product Price</th>
	</tr>
		<c:forEach var="product" items="${allProducts}">
			<tr>
        		<td><c:out value="${product.productId}"/></td>
				<td><c:out value="${product.productName}"/></td>
				<td><c:out value="${product.productPrice}"/></td>	
			</tr>
		</c:forEach>
</table>


</body>
</html>