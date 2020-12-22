<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setAttribute("userName", "손흥민1");
session.setAttribute("userName", "손흥민2");
application.setAttribute("userName", "손흥민");
session.setAttribute("userId", "son");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>

		requestScope.userName : ${requestScope.userName}, ${userName},
		<%=request.getAttribute("userName")%>
		<br> sessionScope.userId : ${sessionScope.userId }, ${userId },
		<%=session.getAttribute("userId")%>
		<br> param.code :
		<%=request.getParameter("code")%>, ${param.code } pageContext :
		${pageContext.request.requestURI},
		<%=pageContext.getRequest().getServletContext().getContextPath()%>
		<br> ${pageContext.request.requestURI} <br>
		${pageContext.request.requestURI} <br>
		${pageContext.request.contextPath},
		<%=request.getContextPath()%>
		<br>

	</h1>

	<a href="view1.jsp">session 페이지 확인</a>
</body>
</html>