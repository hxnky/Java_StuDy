package member.service;

import member.dao.Dao;

public class MemberRegService implements MemberService{

	// 주입 받아야 하는 참조 변수
	private Dao dao;		// 의존성을 낮출 수 있다. 
	
	// 생성자를 통해서 Dao 타입의 인스턴스를 주입 받는다.
	// Dao dao = new MemberDao(); // 다형성
	public MemberRegService(Dao dao) {
		this.dao = dao;
	}
	
	
	@Override
	public Object process() {
		System.out.println("MemberRegService 실행");
		
		dao.insert();
		
		return null;
	}

}
