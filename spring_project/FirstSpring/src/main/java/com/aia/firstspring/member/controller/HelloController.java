package com.aia.firstspring.member.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // handlerMapping에 등록
public class HelloController {

	// 메소드는 ViewName 반환해야한다. 반환 타입은 ModelAndView를 이용해서 반환
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/hello"); // /WEB-INF/view/member/hello.jsp -> member/hello
		mav.addObject("greeting", greeting());
		
		return mav;
	}

	private String greeting() {
		String result = "반갑습니뎅";

		int nowTime = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (nowTime >= 6 && nowTime <= 10) {
			result = "좋은 아침입니뎅!";
		} else if (nowTime >= 12 && nowTime <= 15) {
			result = "점심 먹을 시간입니뎅 !!";
		} else if (nowTime >= 18 && nowTime <= 22) {
			result = "굿나잇 입니뎅 ~";
		}

		return result;
	}

}
