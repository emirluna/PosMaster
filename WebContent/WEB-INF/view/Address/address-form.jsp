<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form registration Address</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>
<div id="wrapper">
		<div id="header">
			<h2>CRM</h2>
		</div>
	</div>


	<div id="container">
		<h3>Save Address</h3>
		<form:form action="${pageContext.request.contextPath}/address/enterprise/saveAddress/${id_e}" 
				   modelAttribute="address" method="POST">
			
			<table>
				<tr>
					<td><label>Country: </label></td>
					<td><form:input path="Country" /></td>
				</tr>
				<tr>
					<td><label>State: </label></td>
					<td><form:input path="State" /></td>
				</tr>
				<tr>
					<td><label>City: </label></td>
					<td><form:input path="City" /></td>
				</tr>
				<tr>
					<td><label>Street: </label></td>
					<td><form:input path="Street" /></td>
				</tr>
				<tr>
					<td><label>Number: </label></td>
					<td><form:input path="Number" /></td>
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