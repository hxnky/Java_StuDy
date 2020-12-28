package jdbc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Loader extends HttpServlet {

	@Override
	public void init() throws ServletException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("GuestBook Mysql 드라이버 로드 성공입니뎅 ヾ(•ω•`)o");
		} catch (ClassNotFoundException e) {
			System.out.println("GuestBook Mysql 드라이버 로드 실패입니뎅 〒▽〒");
			e.printStackTrace();
		}
		
		
	}

	
	
}
