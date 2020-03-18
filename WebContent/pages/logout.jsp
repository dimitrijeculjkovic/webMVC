<%@page import="domain.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>

<div>
	Login user:${loginUser.username}
	<div>
		<c:url value="/application/logout" var="logout"></c:url>
		<a href="<c:out value="${logout}"/>">Logout</a>
	</div>
</div>
