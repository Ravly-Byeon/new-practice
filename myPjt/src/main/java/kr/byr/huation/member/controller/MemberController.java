package kr.byr.huation.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.byr.huation.member.model.service.MemberService;

@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	@Qualifier("memberService")
	private MemberService service;
	
	public MemberController() {
		super();
		System.out.println("syso: memberController 객체 생성완료");
		logger.info("logger: memberController 객체생성 완료");
	}
	
	//로그인 버튼 클릭시
	@RequestMapping(value="/loginPage.do")
	public String loginPage() {
		return "member/login";
	}
}
