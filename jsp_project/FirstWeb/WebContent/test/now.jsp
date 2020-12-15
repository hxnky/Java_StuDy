
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!--  %@ == import -->
<%@ page import="java.util.Date" %>
<%
	Date now = new Date(); // 현재 시간 정보
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>now Date</title>
</head>
<body>

	<!--  %= == 표현식 -->
	<h1>현재 시간 : <%=now %></h1>
	
	<!-- http:// localhost:8080/FirstWeb/now/jsp -->
	<!-- 컨텍스 경로는 배포 과정에서 바뀔 수 있으므로 아래 표현식 알아두는게 좋다. -->
	<h1>컨텍스 경로 : <%= request.getContextPath() %></h1> 
	
	
	
	
</body>
</html>