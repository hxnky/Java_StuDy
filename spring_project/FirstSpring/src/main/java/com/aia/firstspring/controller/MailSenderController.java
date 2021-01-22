package com.aia.firstspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aia.firstspring.service.MailSenderService;

@Controller
@RequestMapping("/mail")		// context 경로 생성
public class MailSenderController {	
	
	@Autowired
	MailSenderService mailSenderService;
	
//	@Autowired
//	private JavaMailSender mailSender;
//	
//	@Autowired
//	private SimpleMailMessage templateMessage;
	
	@RequestMapping("/simplemail")	// /mail/simplemail.jsp 의 경로 생성
	public void simpleMiailSend() {	// void의 경우 return을 해주지 않아도 자동으로 경로를 찾는다.
		
		// mailSenderService.simpleMailSend();
		mailSenderService.mailSend("khk_1026@naver.com");
		
		// return "mail/simplemail";
	}

}
