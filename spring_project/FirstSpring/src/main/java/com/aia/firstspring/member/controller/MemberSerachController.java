package com.aia.firstspring.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberSerachController {

	@RequestMapping("/member/search")
	public String searchMember(/*@RequestParam("p") int pageNumber*/
											@RequestParam(value="p", defaultValue = "1") int pageNumber, 
											// @RequestParam("uid") String uid, 
											@RequestParam(value="uid", required = false) String uid,
											// @RequestParam("name") String name
											@RequestParam(value="name", required = false) String name) {
		
		// http://localhost:8080/.../member/serach?p=1&uid=cool&name=COOL
		
		System.out.println("p : "+ pageNumber);
		System.out.println("uid : " + uid);
		System.out.println("name" + name);
		
		
		
		
		
		
		return "member/search";	// View 경로 반환
	}
	
}
