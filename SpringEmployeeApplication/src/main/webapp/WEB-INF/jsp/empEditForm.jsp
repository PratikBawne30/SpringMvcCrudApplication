<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Edit Employee</h1>
	<form:form method="POST" action="http://localhost:1213/SpringEmployeeApplication/editsave" modelAttribute="editForm">
		<table>

			<tr>
				<td></td>
				<td><form:hidden path="id" />
			</tr>

			<tr>
				<td>Name:</td>
				<td><form:input path="name" />
			</tr>

			<tr>
				<td>Designation:</td>
				<td><form:input path="desg" />
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Edit Save" /></td>
			</tr>

		</table>
	</form:form>

</body>
</html>