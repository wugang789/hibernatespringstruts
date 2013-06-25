package com.cn.action;

import com.cn.bean.user;
import com.cn.service.userService;

public class control {

	private userService userService;
	/**
	 * 删除用户
	 * @return
	 */
 public String deleteUser(){
	 
	 userService.delete(1);
	 
	 return null;
 }
 /**
  * 更新用户
  * @return
  */
 public String updateUser(){
	 user u=new user();
	 userService.update(u);
	 return null;
 }
 /**
  * 添加用户
  * @param userService
  */
 public String addUer(){
	 user u=new user();
	  userService.addUser(u);
	 return null;
 }
 
 
 
public void setUserService(userService userService) {
	this.userService = userService;
}
public userService getUserService() {
	return userService;
}

}
