package com.app.mj.model;

//import lombok.Data;
//@Data
public class Cart {
	private Integer cartId;
	private String cartCode;
	private Double cartFinalCost;

//Default Constructor
	public Cart() {
		super();
	}

//Parameterized constructor
	public Cart(Integer cartId, String cartCode, Double cartFinalCost) {
		super();
		this.cartId = cartId;
		this.cartCode = cartCode;
		this.cartFinalCost = cartFinalCost;
	}

//Set/get Method
	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public String getCartCode() {
		return cartCode;
	}

	public void setCartCode(String cartCode) {
		this.cartCode = cartCode;
	}

	public Double getCartFinalCost() {
		return cartFinalCost;
	}

	public void setCartFinalCost(Double cartFinalCost) {
		this.cartFinalCost = cartFinalCost;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartCode=" + cartCode + ", cartFinalCost=" + cartFinalCost + "]";
	}
}
