<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>
    <%
    out.println("Login : <br>");
        String msg = (String) request.getAttribute("msg");
        if (msg != null) {
        out.println(msg);
        }
    %>
</h1>
	<form action="login">
	userName: <input type="text" name="user">
	<br>
	password: <input type="password" name="pass">
	<br>
	<input type="submit" value="submit">
	</form>

</body>
</html>