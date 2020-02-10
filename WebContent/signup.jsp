<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><center>Aricent registration form</center></h1>
<br>
<link href='https://fonts.googleapis.com/css?family=Ubuntu:500' rel='stylesheet' type='text/css'>

<link href='style.css' rel='stylesheet' type='text/css'>
<center>
<form action="/LoginApp/logincontroller" method="post">
	<link href='https://fonts.googleapis.com/css?family=Ubuntu:500' rel='stylesheet' type='text/css'>

	<table style="width=50%">
	<tr>
		<td>First Name:</td>
		<td><input type="text" name="first_name" /></td><br>
	</tr>
	<tr>
		<td>Last Name:</td>
		<td><input type="text" name="last_name"></td>
	</tr>
	<tr>
		<td>User Name:</td>
		<td><input type="text" name="user_name"></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type="password" name="password"></td>
	</tr>
	<tr>
		<td>Phone No.:</td>
		<td><input type="text" name="phone_no"></td>
	</tr>
	</table>
	<input type="submit" Value="signup" name="button">
</center>
</form>
</body>
</html>