<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Stock</title>

<link type="text/css"
	  rel="stylesheet" 
	  href="${pageContext.request.contextPath}/resources/css/bootstrap.css" >

</head>


<body>
 <div id="container">
		
 	<div class="row">
 	<!-- 
 		<div class="col-md-5">
 	
		<table class="table">
		<thead>Products that are available to be in stock on stock</thead>
			<tr>
				<th>Id product</th>
				<th>Product Name</th>
				<th>Barcode</th>
				<th>Add</th>
			</tr>
	
		<c:forEach var="tempProd" items="${products}">
				<tr>
						<td>
							${tempProd.id}
						</td>
						<td>
							${tempProd.name}
						</td>
						<td>
							${tempProd.barcode}
						</td>
						
						<c:url var="AddLink" value="branch-stock-add">
						<c:param name="idBranch" value="${branch.id}" />
						<c:param name="idProduct" value="${tempProd.id}" />
						</c:url>
						<td><a href="${AddLink}" class="btn btn-primary">Add Product</a></td>
						
					</tr>	
					
		</c:forEach>
		
		</table>
			
 		</div>
 	
		
		<br><br>
	
	 -->
	
 		<div class="col-md-10">
 		
		<table class="table">
		
			<thead>Products that are on stock</thead>
			<tr>
				<th>Id product</th>
				<th>Product Name</th>
				<th>Barcode</th>
				<th>Stock</th>
				<th>Min Stock</th>
				<th>Max Stock</th>
			</tr>
		
		<form:form action="saveBranchStockAdd/${branch.id}" modelAttribute="stock"
			method="POST">
				<form:hidden path="products.id" value="${product.id}"/>		
				<form:hidden path="branches.id" value="${branch.id}"/>
				<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.barcode}</td>
				
				<td><form:input path="stock" /></td>
				
				<td><form:input path="minStock" /></td>
				<td><form:input path="maxStock" /></td>
				
				
				<td><input type="submit" value="Save" class="btn btn-primary" /></td>
				
			</tr>
		
		</form:form>
		
		
		
		<c:forEach var="tempBranchStock" items="${branch.stocks}">
			<tr>
				<td>
					${tempBranchStock.products.id}
				</td>
				<td>
					${tempBranchStock.products.name}
				</td>
				<td>
					${tempBranchStock.products.barcode}
				</td>
				<td>
					${tempBranchStock.stock}
				</td>
				<td>
					${tempBranchStock.minStock}
				</td>
				<td>
					${tempBranchStock.maxStock}
				</td>
			</tr>
		</c:forEach>
		</table>
			
 		</div>
 	</div>
		<p>
			<a href="${pageContext.request.contextPath}">Back to List</a>
		</p>
		
	</div>

</body>

</html>