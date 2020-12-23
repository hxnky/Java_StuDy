<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="msg" value="user1" scope="page" />
	msg : ${msg}

	<c:if test="${msg=='user1}">
	test 속성의 값이 true일 때 출력
	</c:if>

	<c:set var="number" value="12" />

	<c:choose>
		<c:when test="${number > 0 }"> 양수입니다. </c:when>

		<c:when test="${number < 0 }"> 음수입니다. </c:when>

		<c:otherwise> 0입니다. </c:otherwise>
	</c:choose>

	<br>

	<input type="checkbox" ${msg eq 'user1'?'checked':''}>

	<br> id 저장
	<input type="checkbox" ${cookie.uid ne null ? 'checked' : '' }>

</body>
</html>