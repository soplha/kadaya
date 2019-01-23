package com.kedaya.entity.app.user;

import java.io.Serializable;
import java.util.Date;



/**
 *
 *
 * @author qiyurong
 * @email qiyurongde@gmail.com
 * @date 2019-01-23 14:52:54
 */
public class EqUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String phone;
	//
	private String password;
	//昵称
	private String nickname;
	//
	private String logoImg;
	//
	private String name;
	//0.正常注册  1.微信
	private String accountType;
	//
	private Date createTime;
	//
	private Date updateTime;
	//
	private Integer shareUser;
	//最后访问时间
	private Date lastVisitTime;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：昵称
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取：昵称
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置：
	 */
	public void setLogoImg(String logoImg) {
		this.logoImg = logoImg;
	}
	/**
	 * 获取：
	 */
	public String getLogoImg() {
		return logoImg;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：0.正常注册  1.微信
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * 获取：0.正常注册  1.微信
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：
	 */
	public void setShareUser(Integer shareUser) {
		this.shareUser = shareUser;
	}
	/**
	 * 获取：
	 */
	public Integer getShareUser() {
		return shareUser;
	}
	/**
	 * 设置：最后访问时间
	 */
	public void setLastVisitTime(Date lastVisitTime) {
		this.lastVisitTime = lastVisitTime;
	}
	/**
	 * 获取：最后访问时间
	 */
	public Date getLastVisitTime() {
		return lastVisitTime;
	}
}
