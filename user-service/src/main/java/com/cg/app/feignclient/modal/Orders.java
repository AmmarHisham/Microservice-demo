package com.cg.app.feignclient.modal;

public class Orders {

	private Long orderId;
	private String userName;
	private String orderAddress;
	private String productName;

	public Orders(String userName, String orderName) {
		super();
		this.userName = userName;
		this.orderAddress = orderName;
	}

	public Orders() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", userName=" + userName + ", orderAddress=" + orderAddress
				+ ", productName=" + productName + "]";
	}

}
