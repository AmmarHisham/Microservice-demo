package com.cg.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.app.feignclient.ProductAccessor;
import com.cg.app.feignclient.modal.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	ProductAccessor productAccessor;

	
	@HystrixCommand(fallbackMethod = "getBackup")
	@Override
	public String getProductList() {
		List<Product> productList = productAccessor.getProductList();
		return productList.toString();
	}

	public String getBackup() {
		return "Product Service is currently not available please try again later";
	}

}
