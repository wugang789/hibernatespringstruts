package com.cn.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * �û�ʵ����
 * @author Administrator
 *
 */
public class user {

	/**
	 * id
	 */
	private int id;
	/**
	 * ��ɫ��
	 */
	private String name;
	/**
	 * ����
	 */
	private String password;
	
	/**
	 * Ȩ�޼���
	 * @return
	 */
	private Set power=new HashSet<authority>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public user(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public user(int id, String name, String password, Set power) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.setPower(power);
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPower(Set power) {
		this.power = power;
	}
	public Set getPower() {
		return power;
	}
	
}
