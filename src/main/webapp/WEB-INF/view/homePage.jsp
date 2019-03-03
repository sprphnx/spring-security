<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome to Spring Security Demo</title>
</head>
<body>
	<h1>Hey, No WEB.XML !!!!</h1>
	<form:form action="logout" method="POST">
		<button type="submit">Logout</button>
	</form:form>
</body>
</html>