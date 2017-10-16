package com.laoniu.po;

import java.util.List;

public class UserListForm {

	private List<UserInfo> users;

	public List<UserInfo> getUsers() {
		return users;
	}

	public void setUsers(List<UserInfo> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "UserListForm [users=" + users + "]";
	}
	
	
}
