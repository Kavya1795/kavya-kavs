package com.shopmusic.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class UserRole {
	@Id
	private int id;
	private String authority;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	

}
