<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Frame Include</title>

<style>
div.header {
	text-align: center;
}

div.nav {
	text-align: center;
}

div.news, div.shopping {
	width: 45%;
}

div.news {
	float: left;
}

div.shopping {
	float: right;
}

div.footer {
	clear: both;
	text-align: center;
}
</style>

</head>
<body>
	<!-- 각각의 클래스 모듈화  -->
	<!-- %@include == code를 가져온다 -->
	<!-- jsp:include == code의 실행결과를 가져온다 -->
	<%@ include file="header.jsp"%>

	<%@ include file="nav.jsp"%>

	<div class="contents">

		<%@ include file="news.jsp"%>

		<%@ include file="shopping.jsp"%>

	</div>

	<%-- <jsp:include page="footer.jsp">
		<jsp:param value="cool@gmail.com" name="email"/>
		<jsp:param value="010-0000-0000" name="tel"/>
	</jsp:include> --%>

	<!-- jsp:forward == 이 결과만 응답으로 나온다.(분기)  -->
	<jsp:forward page="footer.jsp">
		<jsp:param value="cool@gmail.com" name="email" />
		<jsp:param value="010-0000-0000" name="tel" />
	</jsp:forward>

</body>
</html>