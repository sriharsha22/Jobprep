<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<html>
<body>

<table border="1">
	<tr><th>FirstName</th><th>LastName</th><th>Email</th></tr>
	<c:forEach var="tempStudent" items="${student_list}">
	<tr>
	<td>${tempStudent.firstName}</td>
	<td>${tempStudent.lastName}</td>
	<td>${tempStudent.email}</td>
	</tr>
	</c:forEach>
	
</table>
</body>

</html>