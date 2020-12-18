<%@page import="util.CookieBox"%>
<%@page import="form.member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
	member member = new member();

String userid = request.getParameter("userid");
String pw = request.getParameter("pw");

String chk = request.getParameter("chk");

if (chk != null && chk.equals("on") && userid != null && !(userid.isEmpty())) {
	// 쿠키 생성 저장
	// uid = userid
	response.addCookie(CookieBox.createCookie("uid", userid, "/", 60 * 60 * 24 * 365));

} else {
	response.addCookie(CookieBox.createCookie("uid", userId, "/", 0));
}

member.setUserid(userid);
member.setPw(pw);

request.setAttribute("data", member);
%>

<jsp:forward page="login_view.jsp" />