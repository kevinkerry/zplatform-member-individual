/* 
 * MemberApplyServiceImpl.java  
 * 
 * version TODO
 *
 * 2016年9月26日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.individual.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zlebank.zplatform.commons.utils.BeanCopyUtil;
import com.zlebank.zplatform.member.individual.bean.MemberBean;
import com.zlebank.zplatform.member.individual.dao.MemberApplyDAO;
import com.zlebank.zplatform.member.individual.pojo.PojoMemberApply;
import com.zlebank.zplatform.member.individual.service.MemberApplyService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年9月26日 下午12:08:00
 * @since 
 */

@Service("memberApplyService")
public class MemberApplyServiceImpl implements MemberApplyService{

	@Autowired
	private MemberApplyDAO memberApplyDAO;
	
	/**
	 *
	 * @param memberId
	 * @return
	 */
	@Override
	@Transactional(readOnly=true)
	public MemberBean getMemberApplyByMemberId(String memberId) {
		// TODO Auto-generated method stub
		PojoMemberApply memberApply = memberApplyDAO.getMemberApply(memberId);
		return BeanCopyUtil.copyBean(MemberBean.class, memberApply);
	}

}
