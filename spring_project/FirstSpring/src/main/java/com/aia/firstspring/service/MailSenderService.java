package com.aia.firstspring.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {

	@Autowired
	private JavaMailSender mailSender;

	public boolean simpleMailSend() {

		boolean result = true;

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("khk_1026@naver.com");
		message.setSubject("테스트 이메일 발송입니뎅");
		message.setText("내용입니뎅");
		message.setFrom("aia.hxnky@gmail.com");

		try {
			mailSender.send(message);
		} catch (MailException e) {
			result = false;
		}

		return result;
	}

	public boolean mailSend(String toEmailAddress) {

		boolean result = true;

		MimeMessage message = mailSender.createMimeMessage();

		try {

			message.setSubject("[안내] 회원가입을 축하합니다 !", "utf-8"); // 메일 제목
			String htmlStr = "<h1 style=\"color:red;\">회원가입을 축하합니다 !</h1>";
			message.setText(htmlStr, "utf-8", "html"); // 내용
			message.setFrom(new InternetAddress("aia.hxnky@gmail.com")); // 보내는 사람 / gmail을 사용하는 경우 인증된 메일로 적용됨
			message.addRecipient(RecipientType.TO, new InternetAddress(toEmailAddress, "갱 님", "utf-8")); // 받는 사람
			mailSender.send(message); // 메일 전송
		} catch (MessagingException e) {

			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		}

		return result;
	}

	/*
	 *  param@ toEmailAddress : 보내는 사람의 이메일
	 *  param@ name : 받는 사람의 이름
	 *  param@ subject : 이메일의 제못
	 *  param@ text : 이메일의 내용
	 */
	public boolean mailSend(String toEmailAddress, String name, String subject, String text) {

		boolean result = true;

		MimeMessage message = mailSender.createMimeMessage();

		try {

			message.setSubject("[안내] 회원가입을 축하합니다 !", "utf-8"); // 메일 제목
			// String htmlStr = "<h1 style=\"color:skyblue;\">회원가입을 축하합니다 !</h1>";
			message.setText(text, "utf-8", "html"); // 내용
			message.setFrom(new InternetAddress("aia.hxnky@gmail.com")); // 보내는 사람 / gmail을 사용하는 경우 인증된 메일로 적용됨
			message.addRecipient(RecipientType.TO, new InternetAddress(toEmailAddress, name +" 님", "utf-8")); // 받는 사람
			mailSender.send(message); // 메일 전송
		} catch (MessagingException e) {

			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		}

		return result;
	}

}
