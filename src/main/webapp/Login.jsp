<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>LOGIN UI</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<link rel="stylesheet" type="text/css" href="css/login.css" />
</head>
<script>
	function down() {
		document.getElementById("password").type = "text";
		document.getElementById("checkpass").style = "color:red;";
	}
	function up() {
		document.getElementById("password").type = "password";
		document.getElementById("checkpass").style = "color:blue;";
	}
</script>
<body>
	<div class="login-box">
		<h2>Login</h2>
		<form method="post" action="LoginAction.jsp">
			<div class="user-box">
				<input type="text" name="username" required="" id="username">
				<label>Username</label>
			</div>
			<div class="user-box">
				<input type="password" name="password" required="" id="password">
				<label>Password</label>
				<button type="button" id="checkpass" onmousedown="down()"
					onmouseup="up()">
					<i><span class="material-symbols-outlined">visibility</span></i>
				</button>
			</div>
			<div class="wrapper">
				<input type="submit" value="LOGIN" id="submit" /> <span></span> <span></span>
				<span></span> <span></span> <span></span>
			</div>
		</form>
	</div>
</body>
</html>