<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Market Place ${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap theme CSS -->
<link href="${css}/boostrap-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/style.css" rel="stylesheet">

</head>

<body>
	<div class="wapper">

		<!-- Navigation -->
		<%@include file="./share/Navigation.jsp"%>

		<!-- Page Content -->
		<div class=content>
			<c:if test="${onClickHome==true}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${onClickAbout==true}">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${onClickAllProduct == true or onClickCategoryProduct == true}">
				<%@include file="product.jsp"%>
			</c:if>

			<c:if test="${onClickContact==true}">
				<%@include file="contact.jsp"%>
			</c:if>

		</div>
		<!-- /.container -->

		<!-- Footer -->
		<%@include file="./share/Footer.jsp"%>
		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/popper.js"></script>
		<script src="${js}/bootstrap.min.js"></script>
		<script src="${js}/myApp.js"></script>

	</div>
</body>

</html>
