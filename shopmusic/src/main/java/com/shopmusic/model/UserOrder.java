package com.shopmusic.model;

public class UserOrder {
	private int orderId;
	private cart cart;
	private Customer customer;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public cart getCart() {
		return cart;
	}
	public void setCart(cart cart) {
		this.cart = cart;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
