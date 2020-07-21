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
		<form:form action="${pageContext.request.contextPath}/branches/saveBranch/${id_enterprise}" modelAttribute="branch"
			method="POST">
			
			<table>
				<tr>
					<td><label>Branch Name: </label></td>
					<td><form:input path="branchName" /></td>
					
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