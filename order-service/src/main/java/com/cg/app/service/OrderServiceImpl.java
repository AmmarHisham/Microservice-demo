package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.dao.OrderDAO;
import com.cg.app.modal.Orders;


@Service
public class OrderServiceImpl implements OrderService {

	
	@Autowired
	private OrderDAO orderDAO;
	
	@Override
	public List<Orders> getAllOrders() {
	
		return orderDAO.findAll();
	}

	@Override
	public Orders bookOrder(Orders orders) {

		
		Orders newOrder = orderDAO.save(orders);
		
		return newOrder;
	}

}
