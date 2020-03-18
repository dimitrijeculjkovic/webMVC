<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logged users</title>
</head>
<body>
<form>
		<table>
			<tr>
				<td>Username</td>
				<td>Name</td>
				<td>Surname</td>
			</tr>
			<c:forEach items="${applicationScope.loggedUser}" var="users">
				<tr>
					<td>${users.username}</td>
					<td>${users.firstName}</td>
					<td>${users.lastName}</td>
				</tr>
			</c:forEach>
			<tr>
				<td><c:out value="${requestScope.errorMessage}"></c:out></td>
			</tr>
			
		</table>
	</form>

</body>
</html>