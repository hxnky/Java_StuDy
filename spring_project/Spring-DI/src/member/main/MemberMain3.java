package member.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import member.service.MemberInfoService3;
import member.service.MemberRegService3;

public class MemberMain3 {

	public static void main(String[] args) {

		// 1. Spring 컨테이너 생성
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx7.xml");
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx8.xml");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx9.xml");
		
		// 2. MemberRegService 객체가 필요
		MemberRegService3 regService = ctx.getBean("memberRegService", MemberRegService3.class);

		// 3, MemberRegService --> process() 실행
		regService.process();

		// 4. MemberInfoService 객체
		MemberInfoService3 infoService = ctx.getBean("memberInfoService", MemberInfoService3.class);

		// 5. MemberInfoService -> process()
		infoService.process();

	}

}
