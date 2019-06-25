<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<s:head/>
<meta charset="UTF-8">
<title>Products Management - Login</title>
</head>
<body>

	<div align="center">
		<h2>Add New Product</h2>
		
		<s:form action="addAction" method="post">
			<s:textfield name="name" label="name" errorPosition="bottom" />
			<s:textfield name="price" label="price" errorPosition="bottom" />
			<s:textfield name="category" label="category" errorPosition="bottom" />
			<s:submit value="Add Product" />
			<s:reset value="Reset" />
		</s:form>
	</div>
	
</body>
</html>