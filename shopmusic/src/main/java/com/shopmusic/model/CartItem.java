package com.shopmusic.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CartItem {
	private int cartitemId;
	private double totalAmount;
	private Item quantity;
	private Item item;
	private cart cart;
	@ManyToOne
	@JoinColumn(name="cart id")
	public Item getItem() {
		return item;
	}
	public cart getCart() {
		return cart;
	}
	public void setCart(cart cart) {
		this.cart = cart;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getCartitemId() {
		return cartitemId;
	}
	public void setCartitemId(int cartitemId) {
		this.cartitemId = cartitemId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Item getQuantity() {
		return quantity;
	}
	public void setQuantity(Item quantity) {
		this.quantity = quantity;
	}
}
