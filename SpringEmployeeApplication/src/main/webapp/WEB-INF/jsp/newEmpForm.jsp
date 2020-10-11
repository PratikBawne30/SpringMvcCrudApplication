<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<h1>Add New Employee</h1>

<form:form method="Post" modelAttribute="employee" action="save">
	<table>
		<tr>
			<td>Name:</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Designation:</td>
			<td><form:input path="desg" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input class="btn btn-primary" type="submit" value="Save" /></td>
		</tr>
	</table>
</form:form>