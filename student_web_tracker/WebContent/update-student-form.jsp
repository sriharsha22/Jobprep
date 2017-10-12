
<html>

<body>
	<div id="contents">
		<table>
		<form action="StudentControllerServlet" method="GET">
			<input type="hidden" name="command" value="update"/>
			<input type="hidden" name="command" value="${THE_STUDENT.id}"/>
			<table>
				<tbody>
					<tr>
					<td><label>FirstName:</label></td>
					<td> <input type="text" name="firstName" value="${THE_STUDENT.firstName }"/></td>
				</tr>
				
				<tr>
					<td><label>LastName:</label></td>
					<td> <input type="text" name="lastName" value="${THE_STUDENT.lastName}"/></td>
				</tr>
				
				<tr>
					<td><label>Email:</label></td>
					<td> <input type="text" name="email" value="${THE_STUDENT.email}"/></td>
				</tr>
				
				<tr>
					<td><label></label></td>
					<td> <input type="submit" value="Update"/></td>
				</tr>
				</tbody>
			
			
			</table>
		</form>	
		</table>
	</div>
</body>

</html>