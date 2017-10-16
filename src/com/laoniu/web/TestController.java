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
	 * 基本数据类型绑定
	 * 基本数据类型绑定，不能为空，只能输入这个基本数据类型，如果不是的话，则出现400错误
	 */
	@RequestMapping("baseType.do")
	@ResponseBody
	public String baseType(int age){
		System.out.println("age:"+age);
		return "age:"+age;
	}
	
	/**
	 * 包装类型的数据绑定
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
	 * 简单对象的数据绑定
	 * @param user
	 * @return
	 */
	@RequestMapping("object1.do")
	@ResponseBody
	public String object1(UserInfo user){
		return user.toString();
	}
	
	/**
	 * 多层级对象绑定
	 * @param user
	 * @return
	 */
	@RequestMapping("object2.do")
	@ResponseBody
	public String object2(UserInfo user){
		return user.toString();
	}
	
	/**
	 * 同属性的多对象绑定
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
	 * 数组的数据绑定
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
	 * list的数据绑定
	 * @param list
	 * @return
	 */
	@RequestMapping("list.do")
	@ResponseBody
	public String list(UserListForm userlist){
		
		return userlist.toString();
	}
	
	/**
	 * Set的数据绑定
	 * @param list
	 * @return
	 */
	@RequestMapping("set.do")
	@ResponseBody
	public String Set(UserSetForm userSet){
		
		return userSet.toString();
	}
	
	/**
	 * Map的数据绑定
	 * @param list
	 * @return
	 */
	@RequestMapping("map.do")
	@ResponseBody
	public String map(UserMapForm userMap){
		
		return userMap.toString();
	}
	
	
	/**
	 * 时间类型的数据绑定
	 * @param user
	 * @return
	 */
	@RequestMapping("object4.do")
	@ResponseBody
	public String object4(UserInfo user){
		return user.toString();
	}
	
}
