package com.cg.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.app.feignclient.OrderAccessor;
import com.cg.app.feignclient.ProductAccessor;
import com.cg.app.feignclient.modal.Orders;
import com.cg.app.feignclient.modal.Product;
import com.cg.app.feignclient.modal.ResponseModel;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserBookServiceImpl implements UserBookService {
	
	@Autowired
	OrderAccessor orderAccessor;

	@Autowired
	ProductAccessor productAccessor;

	@Override
	@Transactional
	public ResponseModel bookOrder(String payload) {

		Orders order = orderAccessor.bookOrder(payload);
		Product product = productAccessor.getReducedQtyProductList(payload);

		ResponseModel respone = new ResponseModel();
		respone.setOrders(order);
		respone.setProduct(product);

		return respone;

	}
	

}
