<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트</title>
</head>
<body>

	<h1>회원 리스트</h1>
	<h3>현재 회원 수는 ${memberCnt}명 입니뎅</h3>
	<hr>

<%-- 	${members} --%>

	<table border="1">
		<tr>
			<th>No.</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>회원 사진</th>
			<th>가입 날짜</th>
		</tr>

		<c:forEach items="${members}" var="member">
			<tr>
				<td>${member.idx}</td>
				<td>${member.memberid}</td>
				<td>${member.password}</td>
				<td>${member.membername}</td>
				<td>${member.memberphoto}</td>
				<td>${member.regdate}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>