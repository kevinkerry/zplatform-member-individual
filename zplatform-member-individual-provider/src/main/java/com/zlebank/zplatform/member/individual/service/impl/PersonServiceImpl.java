package com.zlebank.zplatform.member.individual.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zlebank.zplatform.member.commons.utils.BeanCopyUtil;
import com.zlebank.zplatform.member.exception.MemberBussinessException;
import com.zlebank.zplatform.member.individual.bean.PersonBean;
import com.zlebank.zplatform.member.individual.bean.PersonManager;
import com.zlebank.zplatform.member.individual.bean.enums.MemberStatusType;
import com.zlebank.zplatform.member.individual.bean.enums.MemberType;
import com.zlebank.zplatform.member.individual.dao.PersonDAO;
import com.zlebank.zplatform.member.individual.pojo.PojoPersonDeta;
import com.zlebank.zplatform.member.individual.service.PersonService;
import com.zlebank.zplatform.member.individual.service.PrimayKeyService;

/* 
 * PersonServiceImpl.java  
 * 
 * version TODO
 *
 * 2015年9月9日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月9日 下午6:45:03
 * @since
 */
@Service
public class PersonServiceImpl implements PersonService {
	/** 个人生成memberID规则 **/
	private final static String INDIPARATYPE = "INDIBIN";
	@Autowired
	private PersonDAO persondao;
	// @Autowired
	// private MemberService memberservice;
	@Autowired
	private PrimayKeyService primayService;

	// @Autowired
	// private MemberBaseDAO memberBase;
	/**
	 *
	 * @param pers
	 * @throws AbstractBusiAcctException
	 * @throws MemberBussinessException
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
	public String save(PersonBean pers, long userId)
			throws MemberBussinessException {
		// 验证手机号是否存在
		if (persondao.getPersonByPhone(pers.getPhone()) != null) {
			throw new MemberBussinessException("M100001");
		}
		// 验证邮箱是否存在
		if (persondao.getPersonByEmail(pers.getEmail()) != null) {
			throw new MemberBussinessException("M100002");
		}

		// 得到序列
		@SuppressWarnings("deprecation")
		String memberId = primayService.getNexId(INDIPARATYPE);
		// 开通会计账户
		// memberservice.openBusiAcct(pers.getMemberName(), memberId, userId);
		// 开通会计账户
		PojoPersonDeta person = BeanCopyUtil.copyBean(PojoPersonDeta.class,
				pers);
		person.setMemberId(memberId);
		person.setParentMemberId(memberId);
		person.setMemberType(MemberType.INDIVIDUAL);
		Date date = new Date();
		person.setIntime(date);
		person.setStatus(MemberStatusType.NORMAL);
		person.setSex(pers.getSex());
		persondao.merge(person);
		// 将信息插入到memberBase
		/*
		 * PojoMemberBase memberBasepo=new PojoMemberBase();
		 * memberBasepo.setMemberid(memberId);
		 * memberBasepo.setMerchname(pers.getMemberName());
		 * memberBasepo.setMerchtype(BusinessActorType.INDIVIDUAL);
		 * memberBase.saveA(memberBasepo);
		 */
		return memberId;

	}

	/**
	 *
	 * @param phone
	 * @return
	 */
	@Override
	public PersonBean getPersonByPhone(String phone) {
		PojoPersonDeta person = persondao.getPersonByPhone(phone);
		return BeanCopyUtil.copyBean(PersonBean.class, person);
	}

	/**
	 *
	 * @param email
	 * @return
	 */
	@Override
	public PersonBean getPersonByEmail(String email) {
		PojoPersonDeta person = persondao.getPersonByEmail(email);
		return BeanCopyUtil.copyBean(PersonBean.class, person);
	}

	/**
	 *
	 * @param memberId
	 * @return
	 */
	@Override
	public PersonManager getPersonBeanByMemberId(String memberId) {

		PojoPersonDeta person = persondao.getPersonByMemberId(memberId);

		PersonManager pm = BeanCopyUtil.copyBean(PersonManager.class, person);
		pm.setStatus(person.getStatus() == null ? "" : person.getStatus()
				.getCode());
		pm.setSex(person.getSex() == null ? "" : String.valueOf(person.getSex()
				.getCode()));
		return pm;
	}

	/**
	 *
	 * @param memberId
	 * @return
	 */
	@Override
	public PersonBean getPersonByMemberId(String memberId) {
		PojoPersonDeta person = persondao.getPersonByMemberId(memberId);
		return BeanCopyUtil.copyBean(PersonBean.class, person);
	}

}
