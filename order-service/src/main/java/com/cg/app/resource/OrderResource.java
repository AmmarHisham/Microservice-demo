/*package com.cg.app.resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cg.app.modal.Orders;

@Component
public class OrderResource {

	public static List<Orders> orderList = new ArrayList<>();

	public List<Orders> getOrdersByUsername(String userName) {

		List<Orders> ordersList = new ArrayList<>();

		List<Boolean> result = orderList.stream().map(orders -> !orders.getUserName().equals(userName))
				.collect(Collectors.toList());

		for (Orders orders : orderList) {

			if (userName.equalsIgnoreCase(orders.getUserName())) {
				ordersList.add(orders);

			}
		}

		return ordersList;
	}

	public void orders() {
		orderList.add(new Orders("Ammar", "L.P", "10"));
		orderList.add(new Orders("Ammar", "Peter England", "11"));
		orderList.add(new Orders("John", "JackAndJohns", "12"));
		orderList.add(new Orders("Ammar", "Arrow", "13"));
		orderList.add(new Orders("Ammar", "", "14"));

	}

}
*/