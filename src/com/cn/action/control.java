package com.cn.action;

import com.cn.bean.user;
import com.cn.service.userService;

public class control {

	private userService userService;
	/**
	 * ɾ���û�
	 * @return
	 */
 public String deleteUser(){
	 
	 userService.delete(1);
	 
	 return null;
 }
 /**
  * �����û�
  * @return
  */
 public String updateUser(){
	 user u=new user();
	 userService.update(u);
	 return null;
 }
 /**
  * ����û�
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
