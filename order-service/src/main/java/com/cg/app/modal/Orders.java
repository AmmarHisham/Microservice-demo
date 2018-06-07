package com.cg.app.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "orders", schema = "nbc_cust")
@Entity
public class Orders {

	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ORDER_ID")
	private Long orderId;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "ORDER_ADDRESS")
	private String orderAddress;

	@Column(name = "PRODUCT_NAME")
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
