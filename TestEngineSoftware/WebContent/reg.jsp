<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Form</title>
</head>
<body>
	<form method="post" action="RegistrationServlet">
		<center>
			<table border="1" width="30%" cellpadding="3">
				<thead>
					<tr>
						<th colspan="2">Register Here</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>User Name</td>
						<td><input type="text" name="userName" value="" /></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password" value="" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="submit" /></td>
						<td><input type="reset" value="Reset" /></td>
					</tr>
					<tr>
						<!--  <td colspan="2">Pls Sign In Here!! <a href="index.jsp">SIGN-IN</a></td> -->

					</tr>

				</tbody>
			</table>
		</center>
	</form>
</body>
</html>