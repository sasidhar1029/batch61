<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Registration form</h2>
	<form action="register" method="post">
		Name:<input type="text" value="name" required><br>
		<br> Email:<input type="email" value="email"><br>
		<br> Password :<input type="password" value="password" required><br>
		<br> Re-Enter-Password : <input type="password" value="password"
			required><br>
		<br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>