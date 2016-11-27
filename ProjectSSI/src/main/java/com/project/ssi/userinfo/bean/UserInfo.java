package com.project.ssi.userinfo.bean;
/**
 * 用户信息
 * @author Administrator
 *
 */
public class UserInfo {
	private String id;

	private String name;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + "]";
	}

}