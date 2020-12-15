<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원관리프로그램</title>
</head>
<body>

	<h1>Requset Form</h1>
	<hr>

	<form action="requsetResult.jsp" method="get">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="userName" ud="userName"></td>
			</tr>
			<tr>
				<td>직업</td>
				<td><select name="job">
						<option value="프로그래머">프로그래머</option>
						<option value="디자이너">디자이너</option>
						<option value="시스템엔지니어">시스템 엔지니어</option>
				</select></td>
			</tr>
			<tr>
				<td>관심사항</td>
				<td><input type="checkbox" name="interest" value="JAVA">JAVA
					<br> <input type="checkbox" name="interest" value="HTML5">HTML5
					<br> <input type="checkbox" name="interest" value="CSS">CSS
					<br> <input type="checkbox" name="interest" value="Javascript">Javascript
					<br></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="보내기">
				<input type="submit" value="초기화"></td>
			</tr>
		</table>
	</form>



</body>
</html>