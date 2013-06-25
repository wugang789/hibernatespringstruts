package com.cn.service.impl;
import java.util.List;

import com.cn.bean.user;
import com.cn.dao.userDao;
import com.cn.service.userService;

public class userServiceImpl implements userService{
  private userDao dao;
	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Override
	public void update(user u) {
		dao.update(u);
		
	}

	@Override
	public void addUser(user u) {
	    dao.addUser(u);
		
	}

	public void setDao(userDao dao) {
		this.dao = dao;
	}

	public userDao getDao() {
		return dao;
	}

	@Override
	public List login(user u) {
		
		return dao.login(u);
		 
		 
	}

}
