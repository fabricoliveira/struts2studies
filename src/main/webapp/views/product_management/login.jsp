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
		<h2>Login</h2>
		
		<s:form action="loginAction">
			<s:textfield name="username" label="Username" errorPosition="bottom" />
			<s:textfield name="password" label="Password" errorPosition="bottom" />
			<s:submit value="Login" />
			<s:reset value="Reset" />
		</s:form>
	</div>
	
</body>
</html>