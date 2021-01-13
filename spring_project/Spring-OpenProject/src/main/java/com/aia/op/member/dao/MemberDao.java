package com.aia.op.member.dao;

import com.aia.op.member.domain.Member;

public interface MemberDao {

	// public abstract 생략
	int insertMember(Member member);
	Member selectLogin(String id, String pw);
	
	
}
