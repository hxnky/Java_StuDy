package com.aia.firstspring.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.firstspring.member.dao.MemberDao;
import com.aia.firstspring.member.domain.Member;

@Service
public class MemberListService {

	@Autowired
	MemberDao dao;

	/*
	 * public MemberListService(MemberDao dao) { this.dao = dao;
	 * 
	 * }
	 */

	public List<Member> getMemberList() {
		return dao.seleteMemberList();
	}
	
	public int getmemberTotalCount() {
		return dao.selectTotalCount();
	}

}
