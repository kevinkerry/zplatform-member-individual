/* 
 * MemberApplyDubboServiceTest.java  
 * 
 * version TODO
 *
 * 2016年9月26日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.individual;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zlebank.zplatform.member.exception.CreateBusiAcctFailedException;
import com.zlebank.zplatform.member.exception.CreateMemberFailedException;
import com.zlebank.zplatform.member.exception.InvalidMemberDataException;
import com.zlebank.zplatform.member.individual.bean.MemberBean;
import com.zlebank.zplatform.member.individual.bean.enums.MemberType;
import com.zlebank.zplatform.member.individual.service.MemberApplyService;
import com.zlebank.zplatform.member.individual.service.MemberOperationService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年9月26日 下午1:18:17
 * @since 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
public class MemberApplyDubboServiceTest {

	@Autowired
	private MemberApplyService memberApplyService;
	
	@Autowired
	private MemberOperationService memberOperationService;
	@Test
	@Ignore
	public void test_query(){
		MemberBean member = memberApplyService.getMemberApplyByMemberId("200000000000632");
		System.out.println(JSON.toJSON(member));
	}
	@Test
	public void test_registMember() throws IOException{
		MemberBean member = new MemberBean();
		try {
			memberOperationService.registMember(MemberType.INDIVIDUAL, member);
		} catch (InvalidMemberDataException | CreateMemberFailedException
				| CreateBusiAcctFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.in.read();
	}
}
