<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<s:head/>
<meta charset="UTF-8">
<title>Products Management - <s:text name="global.login" /></title>
</head>
<body>

	<div align="center">
		<h2><s:text name="global.login" /></h2>
		
		<s:form action="loginAction">
			<s:textfield name="username" key="global.username" errorPosition="bottom" />
			<s:textfield name="password" key="global.password" type="password" errorPosition="bottom" />
			<s:submit key="global.login" />
		</s:form>
	</div>
	
</body>
</html>