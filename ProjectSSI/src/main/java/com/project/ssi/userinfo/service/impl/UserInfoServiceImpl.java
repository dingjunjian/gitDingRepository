package com.project.ssi.userinfo.service.impl;

import java.util.List;

import com.project.ssi.userinfo.bean.UserInfo;
import com.project.ssi.userinfo.dao.IUserInfoDao;
import com.project.ssi.userinfo.service.IUserInfoService;
/**
 * 用户实现类
 * @author Administrator
 *
 */
public class UserInfoServiceImpl implements IUserInfoService {

	private IUserInfoDao userInfoDao;
	
	public List<UserInfo> findAllUser() {
		// TODO Auto-generated method stub
		return userInfoDao.findAllUser();
	}

	public UserInfo findUser(String id) {
		// TODO Auto-generated method stub
		return userInfoDao.findUser(id);
	}

	public Integer userConutNumber() {
		// TODO Auto-generated method stub
		return userInfoDao.userConutNumber();
	}

	public Integer AddUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoDao.AddUserInfo(userInfo);
	}

	public Integer updateUser(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoDao.updateUser(userInfo);
	}

	public Integer delteUser(String id) {
		// TODO Auto-generated method stub
		return userInfoDao.delteUser(id);
	}

	/**
	 * get/set
	 */
	public IUserInfoDao getUserInfoDao() {
		return userInfoDao;
	}

	public void setUserInfoDao(IUserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	
}
