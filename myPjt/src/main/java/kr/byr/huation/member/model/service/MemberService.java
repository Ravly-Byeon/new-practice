package kr.byr.huation.member.model.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.byr.huation.member.model.dao.MemberDao;

@Service("memberService")
public class MemberService {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	@Autowired
	@Qualifier("memberDao")
	private MemberDao dao;
	
	public MemberService() {
		super();
		logger.info("logger: memberService 생성 완료");
		System.out.println("syso: memberService 생성완료");
	}

}
