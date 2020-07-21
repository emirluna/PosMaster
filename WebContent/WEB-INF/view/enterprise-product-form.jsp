<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form registration Product</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

</head>
<body>
<div id="wrapper">
		<div id="header">
			<h2>New Product</h2>
		</div>
	</div>


	<div id="container">
		<h3>Save Product</h3>
		<form:form action="${pageContext.request.contextPath}/product/saveProduct/${enterpriseId}" 
				modelAttribute="product" method="POST">
			
			<table>
				<tr>
					<td><label>Product Name: </label></td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td><label>Short Name: </label></td>
					<td><form:input path="shortName" /></td>
				</tr>
				<tr>
					<td><label>Barcode: </label></td>
					<td><form:input path="barcode" /></td>
				</tr>
				<tr>
					<td><label>Price: </label></td>
					<td><form:input path="price" /></td>					
				</tr>
					<h3>Product Details</h3>
				</tr>
				<tr>
				
				<tr>
					<td><label>Brand: </label></td>
					<td><form:input path="detail.brand" /></td>
				</tr>
				<tr>
					<td><label>Description: </label></td>
					<td><form:input path="detail.description" /></td>					
				</tr>
				
				
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Save" class="save" /></td>
				</tr>
			</table>

		</form:form>

		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}">Back to List</a>
		</p>
		
	</div>

</body>
</html>