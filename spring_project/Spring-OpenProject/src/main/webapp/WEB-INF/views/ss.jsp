<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="loginType" value="${peeps.loginType}" /> 
		<c:choose>
			<c:when test="${loginType eq 'email' }">
				<img id="profile" src="<c:url value="/fileupload/${peeps.m_photo}"/>">
			</c:when>
			<c:when test="${loginType ne 'email' }">
				<img id="profile" src="<c:url value="${peeps.m_photo}"/>">
			</c:when>
		</c:choose>

</body>
</html>