package com.cn.bean;

public class authority {
 /**
  * id
  */
	 private int id;
	 /**
	  * È¨ÏÞÃû³Æ
	  */
	 private String authorityName;
	 private user u;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorityName() {
		return authorityName;
	}
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	public user getU() {
		return u;
	}
	public void setU(user u) {
		this.u = u;
	}
	public authority(int id, String authorityName, user u) {
		super();
		this.id = id;
		this.authorityName = authorityName;
		this.u = u;
	}
	public authority() {
		super();
		// TODO Auto-generated constructor stub
	}
}
