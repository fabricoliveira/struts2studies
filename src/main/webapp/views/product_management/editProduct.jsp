<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<s:head/>
<meta charset="UTF-8">
<title>Products Management - <s:text name="global.product" /></title>
</head>
<body>

	<div align="center">
	
		<h2>
			<s:if test="%{id == null}">
				<s:text name="global.add.new.product" />
			</s:if>
			<s:else>
				<s:text name="global.update.product" />
			</s:else>
		</h2>
		
		<s:form action="saveAction" method="post">
			<s:hidden name="id" />
			<s:textfield name="name" key="global.name" errorPosition="bottom" />
			<s:textfield name="price" key="global.price" errorPosition="bottom" />
			<s:textfield name="category" key="global.category" errorPosition="bottom" />
			
			<s:if test="%{id == null}">
				<s:submit key="global.add.new.product" />
			</s:if>
			<s:else>
				<s:submit key="global.update.product" />
			</s:else>
			
		</s:form>
			<a href="backAction">
				<button><s:text name="global.back" /></button>
			</a>
	</div>
	
</body>
</html>