<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="styleSheet" href="<c:url value="/css/default.css"/>">
<style>
img {
	width: 100px;
	border-radius: 50%;
}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<%@ include file="/WEB-INF/views/include/nav.jsp"%>
	<div class="contents">
		<h2 class="content_title">NullPointerEception</h2>
	</div>
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
</body>
</html>