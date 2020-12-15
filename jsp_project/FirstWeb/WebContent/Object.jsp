<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 톰캣 안의 메모리에 저장되는 내용 -->
<%
	request.setAttribute("userName", "고한경");

application.setAttribute("userID", "1026");

session.setAttribute("nickName", "hxnky");

pageContext.setAttribute("Age", "23");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>set & get</title>
</head>
<body>

	<%=request.getAttribute("userName")%>,
	<%=application.getAttribute("userID")%>,
	<%=session.getAttribute("nickName")%>,
	<%=pageContext.getAttribute("Age")%>
</body>
</html>