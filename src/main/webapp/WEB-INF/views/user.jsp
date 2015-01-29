<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<style>
	.form-control{
		margin: 2px 0;
	}
</style>
<table>
	<form:form commandName="user" method="POST">
		<tr>
			<td>Name</td>
			<td><form:input path="name" class="form-control" /></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><form:input path="email" class="form-control" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><form:password path="password" class="form-control" /></td>
		</tr>

		<tr>
			<td>Country</td>
			<td><form:select path="country" items="${countriesList}"  class="form-control"/></td>
		</tr>

		<tr>
			<td><input type="submit" value="register" /></td>
		</tr>
	</form:form>
</table>
