package com.aia.op.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aia.op.member.domain.MemberEditRequest;
import com.aia.op.member.service.MemberEditService;

@Controller
@RequestMapping("/member/edit")
public class MemberEditController {
	
	private MemberEditService editService;

	@RequestMapping(method = RequestMethod.GET)
	public String editForm(@RequestParam("idx") int idx, Model model) {

		// Service -> dao -> mapper-> Member 객체 반환
		model.addAttribute("member", editService.getMember(idx));
		
		
		
		return "member/editForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String editMember(MemberEditRequest editRequest) {
		
		System.out.println(editRequest);
		
		return "member/edit";
	}
}
