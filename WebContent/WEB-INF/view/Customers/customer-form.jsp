<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POS - Point Of Sales</title>

<link type="text/css"
	  rel="stylesheet" 
	  href="${pageContext.request.contextPath}/resources/css/bootstrap.css" >
	
</head>
<body>
<div id="wrapper">
		<div id="header">

			<h2>Customers</h2>

		</div>
	</div>

<div id="container">
		<div id="content">

			<input type="button" value="Go Back"
			onclick="window.location.href='../'; return false;"
			class="btn btn-warning" />

			<input type="button" value="Add Customer"
			onclick="window.location.href='branch-form'; return false;"
			class="btn btn-primary" />
<br><br>


			<form:form action="customer-save" modelAttribute="customer"
			method="POST">
			<!-- need to associate this data with customer id -->
			<form:hidden path="Id"/>
			<table>
				<tr>
					<td><label>Name: </label></td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td><label>Last Name: </label></td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td><label>Phone: </label></td>
					<td><form:input path="phone" /></td>
				</tr>
				<tr>
					<td><label>Email: </label></td>
					<td><form:input path="email" /></td>
				</tr>
				
				<tr>
					<td><label>Birth Date: </label></td>
					<td><form:input type="date" path="customer_Detail.birthDate" /></td>
				</tr>
					
				<tr>
					<td><label>Username: </label></td>
					<td><form:input path="customer_Detail.username" /></td>
				</tr>
				
				<tr>
					<td><label>Password: </label></td>
					<td><form:input path="customer_Detail.password" /></td>
				</tr>
				
				<%
				    Calendar calendar = Calendar.getInstance();
				    java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
				%>
				
					<form:hidden path="customer_Detail.registrationDate" value="<%=startDate%>" />
					<form:hidden path="status" value="true"/>
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Save" class="btn btn-primary" /></td>
				</tr>
			</table>

		</form:form>




	</div>
</div>


</body>
</html>