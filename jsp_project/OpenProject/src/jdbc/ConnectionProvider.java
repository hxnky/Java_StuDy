package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() {
		
		Connection conn = null;
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/open?serverTimezone=UTC";
		String user = "hxnky";
		String password = "1026";

		try {
			conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Connection 객체 생성 성공입니뎅");
		} catch (SQLException e) {
			System.out.println("Connection 객체 생성 실패입니뎅");
			e.printStackTrace();
		}
		
		return conn;

	}
	
}
