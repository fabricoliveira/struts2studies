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

	<h2>Register</h2>
	<br>
	
	<s:form action="registerAction">
		<s:textfield name="firstName" label="First name" errorPosition="bottom" />
		<s:textfield name="lastName" label="Last name" errorPosition="bottom" />
		<s:radio name="gender" list="{'Male', 'Female'}" label="Gender" errorPosition="bottom" />
		<s:textfield name="age" label="Age" errorPosition="bottom" />
		<s:textfield name="email" label="E-Mail" errorPosition="bottom" />
		<s:textarea name="address" label="Address" cols="30" rows="7" />
		<s:select list="colors" name="color" headerKey="null" headerValue="Select a color" label="Favourite Color" />
		<s:checkbox name="subscription" value="true" label="Subscribe to our newsletter" />
		<s:checkboxlist list="hobbies" name="hobby" label="Hobbies" />
		<s:submit value="Register" />
		<s:reset value="Reset" />
	</s:form>
	
	<hr>
	
	<h2>Products</h2>
	<br>
	
	<table border="1" width="300">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="products" var="product">
				<tr>
					<td><s:property value="#product.id"/></td>
					<td><s:property value="#product.name"/></td>
					<td><s:property value="#product.price"/></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>

</body>
</html>