package com.aia.op.member.service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.member.dao.MemberDao;
import com.aia.op.member.domain.Member;

@Service
public class MemberLoginService {

	private MemberDao dao;

	@Autowired
	private SqlSessionTemplate template;

	// 로그인 성공 유무 판단
	public boolean login(HttpServletRequest request, HttpServletResponse response) {

		String id = request.getParameter("userid");
		String pw = request.getParameter("pw");
		String chk = request.getParameter("chk");

		dao = template.getMapper(MemberDao.class);

		boolean loginChk = false;

		// 1. Dao -> id, pw 데이터로 검색 --> 존재하면 로그인 처리
		Member member = dao.selectLogin(id, pw);

		System.out.println(member);

		if (member != null) {
			System.out.println("아이디와 비밀번호가 일치합니뎅 ' v '");

			// 현재 세션 속성의 LoginInfo 인스턴스를 저장
			request.getSession().setAttribute("loginInfo", member.toLoginInfo());
			loginChk = true;

			// 2. 사용자가 입력한 아이디(uid)를 쿠키 처리 --> 로그인 성공 시 처리
			if (chk != null && chk.equals("on")) {

				Cookie c = new Cookie("uid", id);
				c.setMaxAge(60 * 60 * 24 * 365); // 쿠키 생성(1년)

				response.addCookie(c);
			} else {

				Cookie c = new Cookie("uid", id);
				c.setMaxAge(0); // 쿠키 소멸

				response.addCookie(c);
			}
		}

		return loginChk;
	}

}
