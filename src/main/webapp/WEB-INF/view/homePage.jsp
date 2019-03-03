<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome to Spring Security Demo</title>
</head>
<body>
	<h1>Hey, This web application is running with No WEB.XML !!!!</h1>
	
	<a href="${pageContext.request.contextPath}/leaders">Leaders</a>
	<a href="${pageContext.request.contextPath}/admins">Admins</a><br>
	<form:form action="logout" method="POST">
		<button type="submit">Logout</button>
	</form:form>
</body>
</html>