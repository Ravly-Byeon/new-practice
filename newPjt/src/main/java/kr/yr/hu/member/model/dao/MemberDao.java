package kr.yr.hu.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("memberDao")
public class MemberDao {

	@Autowired
	SqlSessionTemplate sqlSession;
	
	public MemberDao() {
		super();
		System.out.println("memberDAO 생성완료");
	}
	
	
}
