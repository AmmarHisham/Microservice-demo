package com.cg.app.feignclient.modal;

public class ResponseModel {

	private Orders orders;
	private Product product;

	public ResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseModel(Orders orders, Product product) {
		super();
		this.orders = orders;
		this.product = product;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ResponseModel [orders=" + orders + ", product=" + product + "]";
	}

}
