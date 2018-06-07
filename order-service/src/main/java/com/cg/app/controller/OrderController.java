package com.cg.app.controller;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.app.modal.Orders;
import com.cg.app.service.OrderService;

@RestController
public class OrderController {

	static long count = 0;
	
	@Autowired
	private OrderService orderService;

	@RequestMapping("/")
	public String orderHomeScreen() {
		return String.format("Order Service is running");
	}

	@PostMapping("/bookOrder")
	public Orders bookOrder(@RequestBody String payload) {

		try {
		
			JSONObject jsonObj = new JSONObject(payload);
			String userName = jsonObj.getString("userName");
			String orderAddress = jsonObj.getString("orderAddress");
			String productName = jsonObj.getString("productName");

			Orders newOrder = new Orders();
			newOrder.setOrderId(count++);
			newOrder.setUserName(userName);
			newOrder.setProductName(productName);
			newOrder.setOrderAddress(orderAddress);

			Orders order = orderService.bookOrder(newOrder);

			return order;

		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;

	}

	@RequestMapping("/getAllOrders")
	public List<Orders> getAllOrders() {

		return orderService.getAllOrders();
	}

}
