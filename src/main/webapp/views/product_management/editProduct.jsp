<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<s:head/>
<meta charset="UTF-8">
<title>Products Management - Product</title>
</head>
<body>

	<div align="center">
	
		<h2>
			<s:if test="%{id == null}">
				Add New Product
			</s:if>
			<s:else>
				Update Product
			</s:else>
		</h2>
		
		<s:form action="saveAction" method="post">
			<s:hidden name="id" />
			<s:textfield name="name" label="name" errorPosition="bottom" />
			<s:textfield name="price" label="price" errorPosition="bottom" />
			<s:textfield name="category" label="category" errorPosition="bottom" />
			
			<s:if test="%{id == null}">
				<s:submit value="Add New Product" />
			</s:if>
			<s:else>
				<s:submit value="Update Product" />
			</s:else>
			
		</s:form>
			<a href="backAction">
				<button>Back</button>
			</a>
	</div>
	
</body>
</html>