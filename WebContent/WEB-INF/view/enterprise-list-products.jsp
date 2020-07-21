<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POS - Point Of Sales</title>

<link type="text/css"
	  rel="stylesheet" 
	  href="${pageContext.request.contextPath}/resources/css/style.css" >

</head>
<body>
<div id="wrapper">
		<div id="header">

			<h2>List of Products</h2>

		</div>
	</div>

<div id="container">
		<div id="content">

			<input type="button" value="Add Product"
			onclick="window.location.href='../product/showFormAdd/${enterpriseId}'; return false;"
			class="add-button" />
<table>
		<tr>
			<td>ID</td>
			<td>Product Name</td>
			<td>Short Name</td>
			<td>Barcode</td>
			<td>Measure</td>
			<td>Price</td>
			
			<td>Brand</td>
			<td>Description</td>
		</tr>
		
		<c:forEach var="tempProducts" items="${products}">
			<tr>
				<td>${tempProducts.id}</td>
				<td>${tempProducts.name}</td>
				<td>${tempProducts.shortName}</td>
				<td>${tempProducts.barcode}</td>
				<td>${tempProducts.measure}</td>
				<td>${tempProducts.price}</td>
				<!-- <td><a href="stocks/${tempBranches.id}">See Stocks</a></td> -->
				<td>${tempProducts.detail.brand}</td>
				<td>${tempProducts.detail.description}</td>	
				</tr>
		</c:forEach>
		</table>
		</div>
		</div>

</body>
</html>