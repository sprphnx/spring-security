<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome to Spring Security Demo</title>
</head>
<body>
	<h1>Hey, No WEB.XML !!!!</h1>
	<hr>
	<security:authentication property="principal.username" />
	:
	<security:authentication property="principal.authorities" />
	<hr>
	<form:form action="logout" method="POST">
		<button type="submit">Logout</button>
	</form:form>
</body>
</html>