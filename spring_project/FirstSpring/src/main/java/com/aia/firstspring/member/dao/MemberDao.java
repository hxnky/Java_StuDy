package com.aia.firstspring.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.aia.firstspring.member.domain.Member;

@Repository
public class MemberDao {

	@Autowired
	private JdbcTemplate template;

	// JdbcTemplate template 인스턴스를 주입
	// 1. 생성자 주입 방식
	// 2. 프로퍼티 주입 방식
	// 3. 자동 주입

	/*
	 * // 생성자를 이용한 객체 주입 public MemberDao(JdbcTemplate t) { template = t;
	 * System.out.println("MemberDao  인스턴스가 생성되었습니뎅"); }
	 */

	// 회원 목록
	public List<Member> seleteMemberList() {

		return template.query("select * from open.member order by idx", new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member member = new Member();
				
				member.setIdx(rs.getInt("idx"));
				member.setMemberid(rs.getString("memberid"));
				member.setPassword(rs.getString("password"));
				member.setMembername(rs.getString("membername"));
				member.setMemberphoto(rs.getString("memberphoto"));
				member.setRegdate(rs.getTimestamp("regdate"));
				
				return member;
			}
			
		});
	}
	
	// 전체 회원 수 
	public int selectTotalCount() {
		
		return template.queryForObject("select count(*) from open.member", Integer.class);
	}

	public int insertMember(Member member) {
		
		String sql = "insert into open.member (memberid, membername, password) values(?, ?, ?)";		// idx는 자동 증가, photo는 null
		
		return template.update(sql, member.getMemberid(), member.getMembername(), member.getPassword());
	}
	
	

}
