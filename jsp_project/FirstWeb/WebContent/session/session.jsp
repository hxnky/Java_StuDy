<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	session.setAttribute("userName", "손흥민");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Control</title>
</head>
<body>

<h1>세션에 정보를 저장했습니다.</h1>
<h1><a href="sessionView.jsp">세션의 정보를 확인하세요</h1>
</body>
</html>