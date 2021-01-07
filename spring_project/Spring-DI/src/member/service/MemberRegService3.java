package member.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import member.dao.Dao;

public class MemberRegService3 implements MemberService{

	// 주입 받아야 하는 참조 변수
	@Resource(name = "guestDao")
	private Dao dao;		// 의존성을 낮출 수 있다. 	
	
	@Override
	public Object process() {
		System.out.println("MemberRegService 실행");
		
		dao.insert();
		
		return null;
	}

}
