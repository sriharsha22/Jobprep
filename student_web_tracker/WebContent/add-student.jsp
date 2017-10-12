<html>
<body>
<div id="container">

	<form action="StudentControllerServlet" method="GET">
		<input type="hidden" name="command" value="Add" />
		<table>
			<tbody>
				<tr>
					<td><label>FirstName:</label></td>
					<td> <input type="text" name="firstName"/></td>
				</tr>
				
				<tr>
					<td><label>LastName:</label></td>
					<td> <input type="text" name="lastName"/></td>
				</tr>
				
				<tr>
					<td><label>Email:</label></td>
					<td> <input type="text" name="email"/></td>
				</tr>
				
				<tr>
					<td><label></label></td>
					<td> <input type="submit" value="Save"/></td>
				</tr>
			</tbody>
		
		</table>
	</form>

</div>
</body>
</html>