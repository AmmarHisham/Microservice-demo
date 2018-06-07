package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.dao.ProductDAO;
import com.cg.app.modal.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;

	@Override
	public List<com.cg.app.modal.Product> getAllProduct() {

		return productDAO.findAll();
	}

	@Override
	public Product reduceQuantity(String productId) {
		Product p = productDAO.findOne(productId);

		int qty = p.getProductQuantity();

		p.setProductQuantity(qty - 1);

		productDAO.save(p);

		return p;
	}

}
