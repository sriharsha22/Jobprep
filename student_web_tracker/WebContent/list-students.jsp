<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Student Tracker App</title>
</head>

<body>
	<div id="wrapper">
		<div id="header">
		<h1>Harsha University</h1>
		</div>
	</div>
	
	<div id="container">
		<div id="contents">
			<input type="submit" value="Add Student"
				onclick="window.location.href='add-student.jsp'; return false;"
			/>
			<table>
				<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Action</th>
				</tr>
				
				<c:forEach var="tempStudent" items="${STUDENT_LIST}">
				<c:url vat="tempLink" value="StudentControllerServlet">
					<c:param name="command" value="LOAD"/>
					<c:param name="studentId" value=${tempStudent.id }/>
				</c:url>
					
					<tr>
					<td>${tempStudent.firstName}</td>
					<td>${tempStudent.lastName}</td>
					<td>${tempStudent.email} ></td>
					<td> <a href="${tempLink}">Update</a> </td>
					
					</tr>
				</c:forEach>
				
			</table>
		
		</div>
	
	</div>

	
	
	
	
</body>
</html>