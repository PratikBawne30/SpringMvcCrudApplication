
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Employees List</h1>
	<table border="2" width="60%" cellpadding="2">

		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Designation</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<c:forEach var="emp" items="${listEmployee}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.desg}</td>
				<td><a href="editemp/${emp.id}">Edit</a></td>
				<td><a href="deleteemp/${emp.id}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>

	<br />
	<a href="empform">Add New Employee</a>

</body>
</html>