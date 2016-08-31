package com.shopmusic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/*import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
*/
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int customerId;
	@NotEmpty(message="should not be empty")
	private String username;
	@NotEmpty(message="should not be empty")
	private String password;
	@NotEmpty(message="should not be empty")
	/*@OneToOne
	@JoinColumn(name="cartId")
	
	private Cart cart;*/
	private String emailId;
	/*public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}*/
	private Boolean enabled;
	
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

}
