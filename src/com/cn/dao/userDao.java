package com.cn.dao;

import java.util.List;

import com.cn.bean.user;

public interface userDao {
	public void delete(int id);
	public void update(user u);
	public void addUser(user u);
	public List login(user u);

}
