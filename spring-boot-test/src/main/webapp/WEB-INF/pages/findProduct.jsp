<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Found</title>
</head>
<body>
<h2>Product ID: <c:out value="${product.productId}"/></h2>
<h2>Product Name: <c:out value="${product.productName}"/></h2>
<h2>Product Price: <c:out value="${product.productPrice}"/></h2>
</body>
</html>