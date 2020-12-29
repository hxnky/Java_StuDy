<%@page import="guestbook.exception.InvalidMessagePasswordException"%>
<%@page import="guestbook.exception.MessageNotFoundException"%>
<%@page import="java.sql.SQLException"%>
<%@page import="guestbook.service.DeleteMessageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	// 1. 메시지 아이디, 비밀번호를 받고 2. 서비스 클래스 인스턴스 생성 후 3. 삭제 메소드 실행하고 4. 결과 출력 
 	
 	String messageId = request.getParameter("mid");
 	String pw = request.getParameter("pw");
 	
 	String msg = "정상적으로 삭제되었습니뎅";
 	
 	DeleteMessageService service = DeleteMessageService.getInstance();
 	
 	try{
 		int result = service.deleteMessage(Integer.parseInt(messageId), pw);
 	} catch (SQLException e){
 		msg = "삭제 중 문제가 발생했습니뎅 다시 시도해주세요";
 	} catch(MessageNotFoundException e){
 		msg = "게시물이 존재하지 않습니뎅";
 	} catch(InvalidMessagePasswordException e){
 		msg = "비밀번호가 일치하지 않습니뎅";
 	}
 	
 	request.setAttribute("resultMsg", msg);
 	
 	
 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>${resultMsg}</h3>	
	<a href="list.jsp">게시물 리스트 보기</a>



</body>
</html>