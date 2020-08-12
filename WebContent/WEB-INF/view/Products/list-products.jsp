<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Products</title>

<link type="text/css"
	  rel="stylesheet" 
	  href="${pageContext.request.contextPath}/resources/css/bootstrap.css" >
</head>
<body>

<h2>Products Table</h2>
<br>
<a href="${pageContext.request.contextPath}/product-form">Create Product</a>
<br><br>
<table class="table">
<tr>
<th>Id</th>
<th>Product name</th>
<th>Short name</th>
<th>Measure</th>
<th>Price</th>
<th>Barcode</th>
</tr>
<c:forEach var="tempProducts" items="${products}">
		<tr>
			<td>${tempProducts.id}</td>
			<td>${tempProducts.productName}</td>
			<td>${tempProducts.shortName}</td>
			<td>${tempProducts.measure}</td>
			<td>${tempProducts.price}</td>
			<td>${tempProducts.barcode}</td>
			<c:url var="updateLink" value="/products/edit">
			<c:param name="id" value="${tempProducts.id}" />
			</c:url>
			<td><a href="${updateLink}">Edit</a></td>
			<td><a href="${pageContext.request.contextPath}/products/delete/${tempProducts.id}">Delete</a></td>
		</tr>
</c:forEach>
</table>


<br><br>
<a href="${pageContext.request.contextPath}/products">
Go Back</a>

</body>
</html>