package jdbc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Loader extends HttpServlet {

	// 서블릿 객체를 실행할 때 처음 한 번 실행해주는 메소드
	// 서블릿은 web.xml에 등록하고, 컨테이너가 실행할 때 한 번 서블릿이 실행되도록 설정
	@Override
	public void init() throws ServletException {
		
		// mySQL의 드라이버를 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mySQL 드라이버 로드 성공입니뎅");
		} catch (ClassNotFoundException e) {
			System.out.println("mySQL 드라이버 로드 실패입니뎅");
			e.printStackTrace();
		}
	}

	
	
	
}
