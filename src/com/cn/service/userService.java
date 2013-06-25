package com.cn.service;

import java.util.List;

import com.cn.bean.user;

public interface userService {
	public void delete(int id);
	public void update(user u);
	public void addUser(user u);
	public List login(user u);

}
