
<!--  JSP 블럭 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP</title>
</head>
<body>
	<h1>INDEX</h1>
	
	<h1>세션의 속성에 저장된 userName : <%= session.getAttribute("userName")%></h1>
	
	<ul>
		
		<li><a href="/FirstWeb/test/now.jsp">/FirstWeb/test/now.jsp (절대경로)</a>
		<li><a href="test/now.jsp">test/now.jsp (상대경로)</a>
		<li><a href="test/msword.jsp">test/msword.jsp (상대경로)</a>
		<li><a href="request/requsetForm.jsp">request/requsetForm.jsp (상대경로)</a>
		<li><a href="response/selectPage.jsp">response/selectPage.jsp (상대경로)</a>
		<li><a href="session/session.jsp">session/session.jsp (상대경로)</a>
	</ul>
</body>
</html>