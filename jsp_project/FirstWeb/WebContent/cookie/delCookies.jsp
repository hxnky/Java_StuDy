<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    // 쿠키의 유지 시간을 0으로 설정 : 삭제
    Cookie cookie = new Cookie("userId", "");
    cookie.setMaxAge(0);
    
    response.addCookie(cookie);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>