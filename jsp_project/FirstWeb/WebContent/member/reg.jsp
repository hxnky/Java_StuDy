<%@page import="form.member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    member member = new member();
    
    String userid = request.getParameter("userid");
    String pw = request.getParameter("pw");
    String username = request.getParameter("username");
    String userPhoto = request.getParameter("userPhoto");
    
    member.setUserid(userid);
    member.setPw(pw);
    member.setUsername(username);
    member.setUserPhoto(userPhoto);
    
    request.setAttribute("data", member);
    %>
    
   <jsp:forward page="reg_view.jsp"/>