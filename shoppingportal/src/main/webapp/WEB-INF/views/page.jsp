<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Adding a spring tag library to load assets like js, css,etc -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- it will load the resources i.e.coming from dipatcher file mapping with assets -->
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!-- loading jsp standard tag library () -->

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Portal</title>
</head>
<body>

	${contextRoot} says - ${greeting}

</body>
</html>  -->



<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
 
 <!-- This dynamic title (${title}) will come from Controller i.e. Page Controller -->
<title>Online Shopping - ${title}</title>

<!-- Adding Script element For displaying Active pages and this tile will come from Page controller i.e Home,Contact Us,About Us -->
<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Cyborg Theme CSS -->
<link href="${css}/bootstrap-lux-theme.css" rel="stylesheet">


<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

<!-- For wraping content in one and getting the footer i.e.Copyright thing at the bottom seperately -->
	<div class="wrapper">

	<!-- Navigation -->
	<%@include file="./shared/navbar.jsp" %>

	<!-- Page Content -->
	
	<div class="content">
	<!-- Loading the HOME content -->
	<!-- This content should be loaded only when user prompts to this page i.e. HOME -->
	<!-- Hence,this userClickHome will get from Controller -->
	<c:if test="${userClickHome == true }"> 
	<%@include file="home.jsp" %>
	</c:if>
	
	
	<!-- Loads only when user clicks about -->
	<c:if test="${userClickAbout == true }"> 
	<%@include file="about.jsp" %>
	</c:if>
	
	<!-- Loads only when user clicks contact -->
	<c:if test="${userClickContact == true }"> 
	<%@include file="contact.jsp" %>
	</c:if>
	
	</div>
	
	<!-- Footer -->
	<%@include file="./shared/footer.jsp" %>
	
	<!-- Bootstrap core jQuery and JavaScript -->
	<script src="${js}/jquery.js"></script>
	<script src="${js}/bootstrap.min.js"></script>

	<!-- Self coded JavaScript to link with myapp.js -->
	<script src="${js}/myapp.js"></script>
	
	</div>

</body>

</html>
