package com.project.ssi.userinfo.service;

import java.util.List;

import com.project.ssi.userinfo.bean.UserInfo;

/**
 * 用户service处理接口
 * @author Administrator
 *
 */
public interface IUserInfoService {
	
	/**
	 * 查询全部用户信息
	 * @return
	 */
	public List<UserInfo> findAllUser();
	
	/**
	 * 查询某用户信息
	 * @param id
	 * @return
	 */
	public UserInfo findUser(String id);
	
	/**
	 * 查询所有用户数量
	 * @return
	 */
	public Integer userConutNumber();
	
	/**
	 * 添加用户
	 * @param userInfo
	 * @return
	 */
	public Integer AddUserInfo(UserInfo userInfo);
	
	/**
	 * 修改用户信息
	 * @param userInfo
	 * @return
	 */
	public Integer updateUser(UserInfo userInfo);
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public Integer delteUser(String id);

}
