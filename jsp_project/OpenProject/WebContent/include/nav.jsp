<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<nav>
	<ul>
		<li><a href="<%=request.getContextPath()%>">HOME</a></li>
		<li><a	href="<%=request.getContextPath()%>/member/memberRegForm.jsp">회원가입</a></li>
		<li>
				
				<%
					if(session.getAttribute("loginInfo")==null){
				%>		
			 <a href="<%= request.getContextPath()%>/member/loginForm.jsp">로그인</a>  
			 <%
					} else {
			 %>
			 <a href="<%= request.getContextPath()%>/member/logout.jsp">로그아웃</a>
			 <%
					}
			 %>			 
			 </li>
			<li> <a href="<%= request.getContextPath()%>/member/mypage/mypage1.jsp">mypage1</a>  </li>
			<li> <a href="<%= request.getContextPath()%>/member/mypage/mypage2.jsp">mypage2</a>  </li>

	</ul>
</nav>