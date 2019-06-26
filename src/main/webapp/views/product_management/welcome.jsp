<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products Management - <s:text name="global.welcome" /></title>
</head>
<body>

	<div align="center">
		<h2><s:text name="global.welcome" /></h2>
		
		<a href="views/product_management/editProduct.jsp">
			<button><s:text name="global.add.new.product" /></button>
		</a>
	</div>
	<br>

	<table border="1" width="750" align="center">
		<thead>
			<tr>
				<th>#</th>
				<th><s:text name="global.name" /></th>
				<th><s:text name="global.price" /></th>
				<th><s:text name="global.category" /></th>
				<th colspan="2"><s:text name="global.actions" /></th>
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
						<a href="updateProductAction?id=<s:property value="#product.id"/>">
							<button><s:text name="global.update" /></button>
						</a>
					</td>
					<td>
						<a href="deleteProductAction?id=<s:property value="#product.id"/>">
							<button><s:text name="global.delete" /></button>
						</a>
					</td>
				</tr>
			</s:iterator>
		</tbody>
	
	</table>
</body>
</html>