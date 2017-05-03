package com.maliang.vo.user;

import java.io.Serializable;

import com.base.serviceApi.vo.BaseVo;


public class User extends BaseVo implements Serializable{
	private static final long serialVersionUID = 1L;
	private int userid;
	private String username;
	private int age;
	private String password;
	
	

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

}
