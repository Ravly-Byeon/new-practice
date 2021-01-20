package kr.yr.hu.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import kr.yr.hu.member.model.service.MemberService;

@Controller
public class MemberController {
		
	@Autowired
	@Qualifier("memberService")
	private MemberService service;
	
	public MemberController() {
		super();
		System.out.println("MemberController생성완료");
	}
	
	
}
