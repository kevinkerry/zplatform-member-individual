/* 
 * MemberInfoService.java  
 * 
 * version TODO
 *
 * 2016年9月29日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.individual.service;

import com.zlebank.zplatform.member.individual.bean.MemberApplyBean;
import com.zlebank.zplatform.member.individual.bean.MemberBean;
import com.zlebank.zplatform.member.individual.bean.enums.MemberType;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年9月29日 下午5:08:28
 * @since 
 */
public interface MemberInfoService {

	 /**
     * 通过 会员ID、状态得到会员
     * 
     * @param memberId
     * @param type
     * @return
     */
    public MemberBean getMemberByMemberId(String memberId, MemberType type);

    /**
     * 通过邮箱得到会员信息
     * 
     * @param email
     * @return PojoMember
     */
    public MemberBean getMemberByEmail(String email);
    /**
     * 通过电话得到会员信息
     * 
     * @param phone
     * @return PojoMember
     */
    public MemberBean getMemberByphone(String phone);

    
    /**
     * 通过登陆名和合作机构得到会员信息
     * @param loginName
     * @param phone
     * @return 
     */
    public MemberBean getMemberByLoginNameAndCoopInsti(String loginName, long instiCode);
    /**
     * 通过手机号和合作机构得到会员信息
     * @param loginName
     * @param phone
     * @return 
     */
    public MemberBean getMemberByPhoneAndCoopInsti(String phone, long instiCode);

    /**
     * 更新会员信息
     * @param memberBean
     */
    public void updateMemberInfo(MemberBean memberBean);
    
    /**
     * 保存会员申请数据
     * @param memberApplyBean
     * @return
     */
    public MemberApplyBean saveMemberApply(MemberApplyBean memberApplyBean);
}
