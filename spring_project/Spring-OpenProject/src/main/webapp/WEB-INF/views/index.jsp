<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://ja</va.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- <link rel="styleSheet"
	href="${pageContext.request.contextPath}/css/default.css"> --%>
<%-- <link rel="styleSheet" href="<c:url value="/css/default.css"/>"> --%>
<%@ include file="/WEB-INF/views/include/basicset.jsp"%>
<style>
</style>
</head>
<body>



	<%@ include file="/WEB-INF/views/include/header.jsp"%>

	<%@ include file="/WEB-INF/views/include/nav.jsp"%>

	<div class="contents">
		<h2 class="content_title">index</h2>
		<hr>
		<div class="content">인텍스 페이지 입니다.</div>
	</div>

	<%@ include file="/WEB-INF/views/include/footer.jsp"%>

	<script>
		<c:if test="${type eq 'delete'}">
		<c:if test="${result eq 'ok' }">
		alert('로그아웃 되었습니다.');
		</c:if>
		<c:if test="${result ne 'ok' }">
		alert('로그아웃 처리 과정에서 문제가 발생하였습니다.');
		</c:if>
		</c:if>
	</script>








</body>
</html>