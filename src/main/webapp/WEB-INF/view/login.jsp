<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link rel="stylesheet"
	href="resources/public/css/login.css">
</head>

<body>
	<div id="login">
		<form:form
			action="${pageContext.request.contextPath}/authenticateUser"
			method="POST">
			<h1>Sign In</h1>
			<input type="text" placeholder="Username" name="username">
			<input type="password" placeholder="Password" name="password">
			<button type="submit">Sign in</button>
		</form:form>
	</div>

</body>

</html>