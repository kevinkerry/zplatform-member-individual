/* 
 * MemberApplyServiceTest.java  
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

import com.alibaba.fastjson.JSON;
import com.zlebank.zplatform.member.individual.bean.MemberBean;
import com.zlebank.zplatform.member.individual.service.MemberApplyService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年9月26日 下午12:16:43
 * @since 
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("/spring.xml")
public class MemberApplyServiceTest {

	@Autowired
	private MemberApplyService memberApplyService;
	
	@Test
	public void test_query(){
		MemberBean member = memberApplyService.getMemberApplyByMemberId("200000000000632");
		System.out.println(JSON.toJSONString(member));
	}
}
