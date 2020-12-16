<%@page import="form.member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    member member = new member();
    
    String userid = request.getParameter("userid");
    String pw = request.getParameter("pw");
    
    member.setUserid(userid);
    member.setPw(pw);
    
    request.setAttribute("data", member);

    %>
    
<jsp:forward page="login_view.jsp"/>