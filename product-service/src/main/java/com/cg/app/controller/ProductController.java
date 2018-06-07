package com.cg.app.controller;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.dao.ProductDAO;
import com.cg.app.resource.ProductResource;
import com.cg.app.service.ProductService;
import com.cg.app.modal.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductResource product;

	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public String productHomeScreen() {
		return String.format("Product Service is running");
	}

	@RequestMapping(value = "/getProductOwner", method = RequestMethod.GET)
	public String getProductOwner() {
		return product.getProductOwner();
	}

	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public List<Product> getProductList() {
		return productService.getAllProduct();
	}

	@PostMapping("/reduceQty")
	public Product getProductList(@RequestBody String productPayload) {

		JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(productPayload);
			int productId = jsonObj.getInt("productId");
			Product p = productService.reduceQuantity(productId + "");

			return p;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
