package com.laoniu.po;

/**
 * 部门类
 * @author Administrator
 *
 */
public class Departemnt {

	/**
	 * 部门编号
	 */
	private Integer deId;
	
	/**
	 * 部分名称
	 */
	private String deName;

	public Integer getDeId() {
		return deId;
	}

	public void setDeId(Integer deId) {
		this.deId = deId;
	}

	public String getDeName() {
		return deName;
	}

	public void setDeName(String deName) {
		this.deName = deName;
	}

	@Override
	public String toString() {
		return "Departemnt [deId=" + deId + ", deName=" + deName + "]";
	}
	
	
}
