<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<link href='https://fonts.googleapis.com/css?family=Ubuntu:500' rel='stylesheet' type='text/css'>

<link href='style.css' rel='stylesheet' type='text/css'>
<form action="/LoginApp/logincontroller" method="post">
<div class="login">
  <div class="login-header">
    <h1>Login</h1>
  </div>
  <div class="login-form">
    <h3>Username:</h3>
    <input type="text" placeholder="Username" name="username"><br>
    <h3>Password:</h3>
    <input type="password" placeholder="Password" name="password">
    <br>
    <input type="submit" value="Login" class="login-button" name="button">
    <br><br>
    <a href="/LoginApp/signup.jsp">Signup</a><br></a>
    <br>
    <h6 class="no-access">Can't access your account?</h6>
  </div>
</div>
<div class="error-page">
  <div class="try-again">Error: Try again?</div>
</div>

</form>
</body>
</html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>


    Enter username :<input type="text" name="username"> <br>
    Enter password :<input type="password" name="password"><br>
    <input type="submit" value="Login" name="button">
</form>

</body>
</html>