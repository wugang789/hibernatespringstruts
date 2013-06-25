package com.cn.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cn.bean.user;
import com.cn.dao.userDao;

public class userDaoImpl extends HibernateDaoSupport implements userDao{

	@Override
	public void delete(int id) {
		System.out.println("不做删除操作");
	}

	@Override
	public void update(user u) {
		System.out.println("不做更新操作");
	}

	@Override
	public void addUser(user u) {
		System.out.println("不做增加操作");
	}

	@Override
	public List login(user u) {
		String SQL="SELECT a.authorityName from authority " +
				" a where a.user_id=(SELECT u.id from user u " +
				"WHERE u.name="+"'"+u.getName()+"'"+" and  u.password="+"'"+u.getPassword()+"')";
		System.out.println(SQL);
	Query query=getSession().createSQLQuery(SQL);
	List list=query.list();
		return list;
		
	}

}
