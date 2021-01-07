package member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import member.dao.Dao;

public class MemberRegService2 implements MemberService{

	// 주입 받아야 하는 참조 변수
	@Autowired(required = false)
	@Qualifier("member")
	private Dao dao;		// 의존성을 낮출 수 있다. 	
	
	@Override
	public Object process() {
		System.out.println("MemberRegService 실행");
		
		dao.insert();
		
		return null;
	}

}
