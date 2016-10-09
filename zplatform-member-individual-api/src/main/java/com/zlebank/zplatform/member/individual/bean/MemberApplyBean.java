/* 
 * PojoMember.java  
 * 
 * version TODO
 *
 * 2015年9月7日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.individual.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Member Entity.Copy from zplatform-infrastructure/member
 *
 * @author yangying
 * @version
 * @date 2016年3月4日 上午10:27:55
 * @since 1.3.0
 */
public  class MemberApplyBean implements Serializable{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -5116602087434506099L;
    /**"主键，标示**/
    private long selfId;
    
    private long memId;
    /**会员ID**/
    private String memberId;
    /**合作机构**/
    private long instiCode;
    /**会员昵称**/
    private String memberName;
    /**登录名**/
    private String loginName;
    /**登录密码**/
    private String pwd;
    /**支付密码**/
    private String payPwd;
    /**实名等级，01-未实名，02-姓名+身份证,03-银行卡校验,04-证件审核**/
    private String realnameLv;
    /**手机**/
    private String phone;
    /**邮箱**/
    private String email;
    /**会员类型，01-个人，02-企业**/
    private String memberType;
    /**会员状态，00-正常，02-冻结，99-注销**/
   private String status;
    /**注册认证，01-手机认证，02-邮箱认证，03-Both**/
    private String registerIdent;
    /**锁定时间**/
    private Date lockTime;
    /**会员注册时间**/
    private Date inTime;
    /**修改时间**/
    private Date upTime;
	/**
	 * @return the selfId
	 */
	public long getSelfId() {
		return selfId;
	}
	/**
	 * @param selfId the selfId to set
	 */
	public void setSelfId(long selfId) {
		this.selfId = selfId;
	}
	/**
	 * @return the memId
	 */
	public long getMemId() {
		return memId;
	}
	/**
	 * @param memId the memId to set
	 */
	public void setMemId(long memId) {
		this.memId = memId;
	}
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the instiCode
	 */
	public long getInstiCode() {
		return instiCode;
	}
	/**
	 * @param instiCode the instiCode to set
	 */
	public void setInstiCode(long instiCode) {
		this.instiCode = instiCode;
	}
	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}
	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	/**
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}
	/**
	 * @param loginName the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the payPwd
	 */
	public String getPayPwd() {
		return payPwd;
	}
	/**
	 * @param payPwd the payPwd to set
	 */
	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}
	/**
	 * @return the realnameLv
	 */
	public String getRealnameLv() {
		return realnameLv;
	}
	/**
	 * @param realnameLv the realnameLv to set
	 */
	public void setRealnameLv(String realnameLv) {
		this.realnameLv = realnameLv;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the memberType
	 */
	public String getMemberType() {
		return memberType;
	}
	/**
	 * @param memberType the memberType to set
	 */
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	/**
	 * @return the registerIdent
	 */
	public String getRegisterIdent() {
		return registerIdent;
	}
	/**
	 * @param registerIdent the registerIdent to set
	 */
	public void setRegisterIdent(String registerIdent) {
		this.registerIdent = registerIdent;
	}
	/**
	 * @return the lockTime
	 */
	public Date getLockTime() {
		return lockTime;
	}
	/**
	 * @param lockTime the lockTime to set
	 */
	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}
	
	/**
	 * @return the upTime
	 */
	public Date getUpTime() {
		return upTime;
	}
	/**
	 * @param upTime the upTime to set
	 */
	public void setUpTime(Date upTime) {
		this.upTime = upTime;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the inTime
	 */
	public Date getInTime() {
		return inTime;
	}
	/**
	 * @param inTime the inTime to set
	 */
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
    
}
