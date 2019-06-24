<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Struts 2 with Maven - SUCCESS</title>
</head>
<body>

	<h2>Welcome</h2>
	<br>
	<s:label value="First Name:" />
	<s:property value="firstName" /><br>
	
	<s:label value="Last Name:" />
	<s:property value="lastName" /><br>
	
	<s:label value="Gender:" />
	<s:property value="gender" /><br>
	
	<s:label value="Age:" />
	<s:property value="age" /><br>
	
	<s:label value="E-Mail:" />
	<s:property value="email" /><br>
	
	<s:label value="Address:" />
	<s:property value="address" /><br>
	
	<s:label value="Favourite Color:" />
	<s:property value="color" /><br>

	<s:label value="Subscribe to our newsletter:" />
	
	<s:if test="%{subscription == true}">
		<div>You are a subscriber</div>
	</s:if>
	<s:else>
		<div>You are not a subscriber</div>
	</s:else>
	<br>
	
	<s:label value="Hobby:" />
	<s:property value="hobby" /><br>

</body>
</html>