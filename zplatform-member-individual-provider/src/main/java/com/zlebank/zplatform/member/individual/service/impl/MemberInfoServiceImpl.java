/* 
 * MemberInfoServiceImpl.java  
 * 
 * version TODO
 *
 * 2016年9月29日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.individual.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zlebank.zplatform.member.commons.utils.BeanCopyUtil;
import com.zlebank.zplatform.member.individual.bean.MemberApplyBean;
import com.zlebank.zplatform.member.individual.bean.MemberBean;
import com.zlebank.zplatform.member.individual.bean.enums.MemberType;
import com.zlebank.zplatform.member.individual.dao.MemberApplyDAO;
import com.zlebank.zplatform.member.individual.dao.MemberDAO;
import com.zlebank.zplatform.member.individual.pojo.PojoMember;
import com.zlebank.zplatform.member.individual.pojo.PojoMemberApply;
import com.zlebank.zplatform.member.individual.service.MemberInfoService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年9月29日 下午5:12:10
 * @since 
 */
@Service("memberInfoService")
public class MemberInfoServiceImpl implements MemberInfoService{

	@Autowired
    private MemberDAO memberDAO;
	@Autowired
	private MemberApplyDAO memberApplyDAO;
	/**
	 *
	 * @param memberId
	 * @param type
	 * @return
	 */
	@Override
	public MemberBean getMemberByMemberId(String memberId, MemberType type) {
		// TODO Auto-generated method stub
		PojoMember member = memberDAO.getMemberByMemberId(memberId, type);
		if(member!=null){
			return BeanCopyUtil.copyBean(MemberBean.class, member);
		}
		return null;
	}

	/**
	 *
	 * @param email
	 * @return
	 */
	@Override
	public MemberBean getMemberByEmail(String email) {
		PojoMember member = memberDAO.getMemberByEmail(email);
		if(member!=null){
			return BeanCopyUtil.copyBean(MemberBean.class, member);
		}
		return null;
	}

	/**
	 *
	 * @param phone
	 * @return
	 */
	@Override
	public MemberBean getMemberByphone(String phone) {
		PojoMember member = memberDAO.getMemberByphone(phone);
		if(member!=null){
			return BeanCopyUtil.copyBean(MemberBean.class, member);
		}
		return null;
	}

	/**
	 *
	 * @param loginName
	 * @param instiCode
	 * @return
	 */
	@Override
	public MemberBean getMemberByLoginNameAndCoopInsti(String loginName,
			long instiCode) {
		PojoMember member = memberDAO.getMemberByLoginNameAndCoopInsti(loginName, instiCode);
		if(member!=null){
			return BeanCopyUtil.copyBean(MemberBean.class, member);
		}
		return null;
	}

	/**
	 *
	 * @param phone
	 * @param instiCode
	 * @return
	 */
	@Override
	public MemberBean getMemberByPhoneAndCoopInsti(String phone, long instiCode) {
		PojoMember member = memberDAO.getMemberByPhoneAndCoopInsti(phone, instiCode);
		if(member!=null){
			return BeanCopyUtil.copyBean(MemberBean.class, member);
		}
		return null;
	}

	/**
	 *
	 * @param memberBean
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Throwable.class)
	public void updateMemberInfo(MemberBean memberBean) {
		// TODO Auto-generated method stub
		PojoMember member = BeanCopyUtil.copyBean(PojoMember.class,memberBean);
		memberDAO.update(member);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Throwable.class)
	public MemberApplyBean saveMemberApply(MemberApplyBean memberApplyBean){
		PojoMemberApply pojoMemberApply = BeanCopyUtil.copyBean(PojoMemberApply.class, memberApplyBean);
		PojoMemberApply merge = memberApplyDAO.merge(pojoMemberApply);
		return BeanCopyUtil.copyBean(MemberApplyBean.class, merge);
	}

}
