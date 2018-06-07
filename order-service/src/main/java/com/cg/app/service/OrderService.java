package com.cg.app.service;

import java.util.List;

import com.cg.app.modal.Orders;

public interface OrderService {

	public List<Orders> getAllOrders();  
	
	public Orders bookOrder(Orders orders);
	
}
