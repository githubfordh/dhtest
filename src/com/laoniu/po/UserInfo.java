package com.laoniu.po;

import java.util.Date;

/**
 * �û���Ϣ�����ʵ����
 * @author Administrator
 *
 */
public class UserInfo {

	//���
	private Integer id;
	
	//����
	private String name;
	
	//����
	private Date date;
	
	//����
	private Integer age;
	
	//������Ϣ
	private Departemnt depart;
	
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Departemnt getDepart() {
		return depart;
	}

	public void setDepart(Departemnt depart) {
		this.depart = depart;
	}

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
		return "UserInfo [id=" + id + ", name=" + name + ", date=" + date + ", age=" + age + ", depart=" + depart + "]";
	}


}
