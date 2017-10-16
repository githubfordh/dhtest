package com.laoniu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.laoniu.po.Admin;
import com.laoniu.po.UserInfo;
import com.laoniu.po.UserListForm;
import com.laoniu.po.UserMapForm;
import com.laoniu.po.UserSetForm;

@Controller
public class TestController {

	/**
	 * �����������Ͱ�
	 * �����������Ͱ󶨣�����Ϊ�գ�ֻ��������������������ͣ�������ǵĻ��������400����
	 */
	@RequestMapping("baseType.do")
	@ResponseBody
	public String baseType(int age){
		System.out.println("age:"+age);
		return "age:"+age;
	}
	
	/**
	 * ��װ���͵����ݰ�
	 * @param age
	 * @return
	 */
	@RequestMapping("baseType2.do")
	@ResponseBody
	public String baseType2(Integer age){
		System.out.println("age:"+age);
		return "age:"+age;
	}
	
	/**
	 * �򵥶�������ݰ�
	 * @param user
	 * @return
	 */
	@RequestMapping("object1.do")
	@ResponseBody
	public String object1(UserInfo user){
		return user.toString();
	}
	
	/**
	 * ��㼶�����
	 * @param user
	 * @return
	 */
	@RequestMapping("object2.do")
	@ResponseBody
	public String object2(UserInfo user){
		return user.toString();
	}
	
	/**
	 * ͬ���ԵĶ�����
	 * @param user
	 * @param admin
	 * @return
	 */
	@RequestMapping("object3.do")
	@ResponseBody
	public String object3(UserInfo user,Admin admin){
		System.out.println("------object3-----");
		return user.toString()+"  "+admin;
	}
	
	@InitBinder("userInfo")
	public void initUser(WebDataBinder binder){
		System.out.println("------initUser-----");
		binder.setFieldDefaultPrefix("user.");
	}
	
	@InitBinder("admin")
	public void initAdmin(WebDataBinder binder){
		System.out.println("------initAdmin-----");
		binder.setFieldDefaultPrefix("admin.");
	}
	
	/**
	 * ��������ݰ�
	 * @param name
	 * @return
	 */
	@RequestMapping("array.do")
	@ResponseBody
	public String array(String[] name){
		StringBuffer str = new StringBuffer();
		for(String s:name){
			str.append(s).append("  ");
		}
		
		return str.toString();
	}
	
	/**
	 * list�����ݰ�
	 * @param list
	 * @return
	 */
	@RequestMapping("list.do")
	@ResponseBody
	public String list(UserListForm userlist){
		
		return userlist.toString();
	}
	
	/**
	 * Set�����ݰ�
	 * @param list
	 * @return
	 */
	@RequestMapping("set.do")
	@ResponseBody
	public String Set(UserSetForm userSet){
		
		return userSet.toString();
	}
	
	/**
	 * Map�����ݰ�
	 * @param list
	 * @return
	 */
	@RequestMapping("map.do")
	@ResponseBody
	public String map(UserMapForm userMap){
		
		return userMap.toString();
	}
	
	
	/**
	 * ʱ�����͵����ݰ�
	 * @param user
	 * @return
	 */
	@RequestMapping("object4.do")
	@ResponseBody
	public String object4(UserInfo user){
		return user.toString();
	}
	
}
