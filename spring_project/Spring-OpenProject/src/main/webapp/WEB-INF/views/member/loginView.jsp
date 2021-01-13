<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${not loginChk}">
<script>
	alert("아이디 또는 비밀번호가 틀립니다. 다시 로그인해주세요. ");
	history.go(-1);
</script>
</c:if>
<c:if test="${loginChk}">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="styleSheet" href="${url_defaultCss}">
<style>

img{
	width : 100px;
	border-radius: 50%; /* 동그랗게 만든다 */
}

</style>
</head>
<body >


	<%@ include file="/WEB-INF/views/include/header.jsp"  %>
		
	<%@ include file="/WEB-INF/views/include/nav.jsp"  %>
	
	<div class="contents">
		<h2 class="content_title">Login</h2>
		<hr>
		<div class="content">
		로그인 되었습니뎅 ( •̀ ω •́ )✧ <br>
		${loginInfo} <br>
		<img alt="회원사진" src="<c:url value="/fileupload/member/${loginInfo.memberphoto}"/>"> 
		</div>
	</div>
	
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>

</body>
</html>
</c:if>