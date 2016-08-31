package com.shopmusic.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.criteria.Fetch;

public class cart {
	private int cartId;
	private double grandtotal;
	@OneToOne
	@JoinColumn(name="customerId")
	private Customer customer;
	@OneToMany(mappedBy ="cart", cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<CartItem> cartitem;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public double getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(double grandtotal) {
		this.grandtotal = grandtotal;
	}

}
	
	