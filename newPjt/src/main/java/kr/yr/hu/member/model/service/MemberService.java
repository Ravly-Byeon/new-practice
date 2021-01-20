package kr.yr.hu.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.yr.hu.member.model.dao.MemberDao;

@Service("memberService")
public class MemberService {

	@Autowired
	@Qualifier("memberDao")
	private MemberDao dao;
	
	public MemberService() {
		super();
		System.out.println("memberService 생성완료");
	}
	
	
}
