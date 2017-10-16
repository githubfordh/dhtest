package com.laoniu.po;

import java.util.HashSet;
import java.util.Set;

public class UserSetForm {

	private Set<UserInfo> users;
	
	public UserSetForm(){
		users = new HashSet();
		users.add(new UserInfo());
		users.add(new UserInfo());
		users.add(new UserInfo());
	}

	public Set<UserInfo> getUsers() {
		return users;
	}

	public void setUsers(Set<UserInfo> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "UserSetForm [users=" + users + "]";
	}
	

	
}
