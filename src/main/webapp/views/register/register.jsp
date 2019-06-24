<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<s:head/>
<meta charset="UTF-8">
<title>Struts 2 with Maven - Register</title>
</head>
<body>

	<h1>Register</h1>
	<br>
	
	<s:form action="registerAction">
		<s:textfield name="firstName" label="First name" errorPosition="bottom" />
		<s:textfield name="lastName" label="Last name" errorPosition="bottom" />
		<s:radio name="gender" list="{'Male', 'Female'}" label="Gender" errorPosition="bottom" />
		<s:textfield name="age" label="Age" errorPosition="bottom" />
		<s:textfield name="email" label="E-Mail" errorPosition="bottom" />
		<s:textarea name="address" label="Address" cols="30" rows="7" />
		<s:submit value="Register" />
		<s:reset value="Reset" />
	</s:form>

</body>
</html>