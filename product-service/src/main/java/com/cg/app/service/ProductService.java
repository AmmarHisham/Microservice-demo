package com.cg.app.service;

import java.util.List;
import com.cg.app.modal.Product;

public interface ProductService {

	public List<Product> getAllProduct();

	public Product reduceQuantity(String productId);

}
