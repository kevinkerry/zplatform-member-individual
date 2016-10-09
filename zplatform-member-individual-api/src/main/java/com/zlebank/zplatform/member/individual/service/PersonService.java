/* 
 * PersonService.java  
 * 
 * version TODO
 *
 * 2015年9月9日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.individual.service;

import com.zlebank.zplatform.member.exception.MemberBussinessException;
import com.zlebank.zplatform.member.individual.bean.PersonBean;
import com.zlebank.zplatform.member.individual.bean.PersonManager;


/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月9日 下午6:42:21
 * @since 
 */
public interface PersonService {
    /**
     * 个人会员录入
     * @param pers
     * @return busiCode
     */
    public String save(PersonBean pers,long userId)throws MemberBussinessException;

    /**
     * 通过手机号查询会员信息
     * @param phone
     * @return
     */
    public PersonBean getPersonByPhone(String phone);
       /**
        * 通过emal查询会员信息
        * @param email
        * @return
        */
    public PersonBean getPersonByEmail(String email);
    
        /**
         * 通过memberId得到会员信息
         * @param memberId
         * @return
         */
    public PersonManager getPersonBeanByMemberId(String memberId);

    /**
     * 通过memberId得到会员信息
     * @param memberId
     * @return
     */
    public PersonBean getPersonByMemberId(String memberId);
}
