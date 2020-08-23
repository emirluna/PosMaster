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

			<h2>List of Branches</h2>

		</div>
	</div>

<div id="container">
		<div id="content">

			<input type="button" value="Add Branch"
			onclick="window.location.href='branch-form'; return false;"
			class="add-button" />

	<table>
		<tr>
			<td>ID</td>
			<td>Branch Name</td>
			<td>Address</td>
			
		</tr>
	
		<c:forEach var="tempBranches" items="${branches}">
			<tr>
				<td>${tempBranches.id}</td>
				<td>${tempBranches.branchName}</td>
				<c:choose>
					<c:when test="${tempBranches.address_ == null}">
						<c:url var="AddressLink" value="branch-address-form">
						<c:param name="id" value="${tempBranches.id}" />
						</c:url>
						<td><a href="${AddressLink}">Add an Address</a></td>
					</c:when>
					<c:otherwise>
						<td><a>See Address</a></td>
					</c:otherwise>
				</c:choose>
				
				
				<c:choose>
					<c:when test="${tempBranches.stocks.isEmpty()}">
						<c:url var="StockLink" value="branch-stock-form">
						<c:param name="id" value="${tempBranches.id}" />
						</c:url>
						<td><a href="${StockLink}">Add Products</a></td>
					</c:when>
					<c:otherwise>
						<td><a>See Stock</a></td>
					</c:otherwise>
				</c:choose>
				
				</tr>
		</c:forEach>


	</table>
	</div>
</div>


</body>
</html>