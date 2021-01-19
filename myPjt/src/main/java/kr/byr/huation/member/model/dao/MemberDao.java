package kr.byr.huation.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("memberDao")
public class MemberDao {
	private static final Logger logger = LoggerFactory.getLogger(MemberDao.class);
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public MemberDao() {
		super();
		logger.info("logger: memberDao 생성완료");
		System.out.println("syso: memberDao 생성완료");
	}
}
