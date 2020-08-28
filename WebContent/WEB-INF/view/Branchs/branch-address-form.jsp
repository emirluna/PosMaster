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
		<form:form action="saveBranchAddress/${branchId}" modelAttribute="address"
			method="POST">
			<table>
				<tr>
					<td><label>Country: </label></td>
					<td><form:input path="country" /></td>
				</tr>
				
				<tr>
					<td><label>State: </label></td>
					<td><form:input path="state" /></td>
				</tr>	
				
				<tr>
					<td><label>City: </label></td>
					<td><form:input path="city" /></td>
				</tr>
				
				<tr>
					<td><label>Street: </label></td>
					<td><form:input path="street" /></td>
				</tr>
				
				
				<tr>
					<td><label>Number: </label></td>
					<td><form:input path="number" /></td>
				</tr>
				
				<tr>
					<td><label>ZipCode: </label></td>
					<td><form:input path="zipCode" /></td>
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