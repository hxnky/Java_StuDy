<%@page import="util.CookieBox"%>
<%@page import="form.member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
	String userid = request.getParameter("userid");
String pw = request.getParameter("pw");

String chk = request.getParameter("chk");

if (chk != null && chk.equals("on") && userid != null && !(userid.isEmpty())) {
	// 쿠키 생성 저장
	// uid = userid
	response.addCookie(CookieBox.createCookie("uid", userid, "/", 60 * 60 * 24 * 365));

} else {
	response.addCookie(CookieBox.createCookie("uid", userid, "/", 0));
}

// session을 이용해서 로그인 처리
// id, pw 비교해서 같으면 로그인 성공, 다르면 실패
boolean loginChk = false;

if (userid.equals(pw)) {
	member member = new member();
	// 로그인 처리
	member.setUserid(userid);
	member.setPw(pw);

	request.setAttribute("data", member);

	// 로그인 정보를 session 객체의 속성에 저장
	session.setAttribute("loginInfo", member);

	loginChk = true;
} else {
	// 로그인 실패

}

// login_view.jsp로 포워딩
if (loginChk) {
%>

<jsp:forward page="login_view.jsp" />
<%
	} else {
%>
<script>
	alert("아이디 또는 비밀번호가 틀립니다. 다시 로그인해주세요.");
	history.go(-1);
</script>
<%
	}
%>


