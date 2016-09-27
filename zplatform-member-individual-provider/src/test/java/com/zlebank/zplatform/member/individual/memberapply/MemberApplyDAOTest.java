/* 
 * MemberApplyDAOTest.java  
 * 
 * version TODO
 *
 * 2016年9月26日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.individual.memberapply;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.alibaba.fastjson.JSON;
import com.zlebank.zplatform.member.individual.dao.MemberApplyDAO;
import com.zlebank.zplatform.member.individual.pojo.PojoMemberApply;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年9月26日 上午11:23:07
 * @since 
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("/spring.xml")
public class MemberApplyDAOTest {

	@Autowired
	private MemberApplyDAO memberApplyDAO;
	
	@Test
	public void test_query(){
		PojoMemberApply memberApply = memberApplyDAO.getMemberApply("200000000000632");
		System.out.println(JSON.toJSONString(memberApply));
		Assert.notNull(memberApply);//assertNotNull(memberApply);
	}
}
