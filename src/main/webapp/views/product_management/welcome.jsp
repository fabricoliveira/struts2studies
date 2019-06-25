<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products Management - Welcome</title>
</head>
<body>

	<div align="center">
		<h2>Welcome</h2>
		
		<a href="views/product_management/addProduct.jsp">
			<button>Add new Product</button>
		</a>
	</div>
	<br>

	<table border="1" width="750" align="center">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Price</th>
				<th>Category</th>
				<th colspan="2">Actions</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="products" var="product">
				<tr>
					<td><s:property value="#product.id"/></td>
					<td><s:property value="#product.name"/></td>
					<td><s:property value="#product.price"/></td>
					<td><s:property value="#product.category"/></td>
					<td>
						Update
					</td>
					<td>
						Delete
					</td>
				</tr>
			</s:iterator>
		</tbody>
	
	</table>
</body>
</html>