/* 
 * MemberApplyService.java  
 * 
 * version TODO
 *
 * 2016年9月26日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.individual.service;

import com.zlebank.zplatform.member.individual.bean.MemberBean;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年9月26日 下午12:02:46
 * @since 
 */
public interface MemberApplyService {

	/**
	 * 获取审核中的会员信息
	 * @param memberId
	 * @return
	 */
	public MemberBean getMemberApplyByMemberId(String memberId);
}
