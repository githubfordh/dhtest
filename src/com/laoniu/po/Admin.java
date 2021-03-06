package com.laoniu.po;

/**
 * 管理员类
 * @author Administrator
 *
 */
public class Admin {

	//编号
	private Integer id;
	
	//姓名
	private String name;
	
	//年龄
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	
	
}
