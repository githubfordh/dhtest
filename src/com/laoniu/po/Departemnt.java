package com.laoniu.po;

/**
 * ������
 * @author Administrator
 *
 */
public class Departemnt {

	/**
	 * ���ű��
	 */
	private Integer deId;
	
	/**
	 * ��������
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
