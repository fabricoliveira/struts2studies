<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Struts 2 with Maven - SUCCESS</title>
</head>
<body>

	<s:form action="testAction">
		<s:textfield name="firstName" label="First Name" /><br>
		<s:textfield name="lastName" label="Last Name" /><br>
		
		<s:submit value="Submit" />
	</s:form>

</body>
</html>