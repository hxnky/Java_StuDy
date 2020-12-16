<%@page import="form.member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	member data = (member) request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 정보 확인</title>
</head>
<body>

<h1>회원가입 정보 출력</h1>
	<table>
		<tr>
			<td>아이디</td>
			<td><%=data.getUserid() %></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%=data.getPw() %></td>
		</tr>
		<tr>
			<td>회원이름</td>
			<td><%=data.getUsername() %></td>
		</tr>
		<tr>
			<td>회원사진</td>
			<td><%=data.getUserPhoto() %></td>
		</tr>
	</table>
	
</body>
</html>