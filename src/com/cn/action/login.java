package com.cn.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cn.bean.user;
import com.cn.service.userService;

public class login {
	private static final String YES="yes";
	private static final String FAIL="fail";
	private user u;
	private userService userService;
	HttpServletRequest request = ServletActionContext.getRequest();  
	HttpServletResponse response = ServletActionContext.getResponse();  
	public String myLogin(){
		System.out.println(userService+">>>>>>>>>>>..");
	List list=userService.login(u);
	if(list.size()!=0){
		/**
		 * 保存权限到session
		 */
		
		System.out.println(list);
		HttpSession session = request.getSession(); 
		session.setAttribute("mylist", list);
		return YES;
	}else{
		return FAIL;
	}
	}
	public void setU(user u) {
		this.u = u;
	}
	public user getU() {
		return u;
	}
	public void setUserService(userService userService) {
		this.userService = userService;
	}
	public userService getUserService() {
		return userService;
	}

}
