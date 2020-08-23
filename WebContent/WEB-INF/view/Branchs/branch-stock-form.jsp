<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Form registration customer</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

</head>


<body>

	<div id="wrapper">
		<div id="header">
			<h2>New Branch</h2>
		</div>
	</div>


	<div id="container">
		<h3>Save Branch</h3>
		<form:form action="saveBranchStock/${branch.id}" modelAttribute="stock"
			method="POST">
			<table>
				<form:hidden path="branches.id" value="${branch.id}"/>
			<tr>
					<td><label>Product: </label></td>
					<td>
					<form:select path="products.id">
						
						<c:forEach var="temProducts" items="${product}">
							
							<form:option value="${temProducts.id}">${temProducts.name}</form:option>
						
						</c:forEach>
					
					</form:select>
					</td>
				</tr>
			
				<tr>
					<td><label>Stock: </label></td>
					<td><form:input path="stock" /></td>
				</tr>
				
				<tr>
					<td><label>Min Stock: </label></td>
					<td><form:input path="minStock" /></td>
				</tr>	
				
				<tr>
					<td><label>Max Stock: </label></td>
					<td><form:input path="maxStock" /></td>
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