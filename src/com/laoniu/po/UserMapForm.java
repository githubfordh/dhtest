package com.laoniu.po;

import java.util.Map;

public class UserMapForm {

	private Map<String,UserInfo> users;

	public Map<String, UserInfo> getUsers() {
		return users;
	}

	public void setUsers(Map<String, UserInfo> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "UserMapForm [users=" + users + "]";
	}
	
	
}
