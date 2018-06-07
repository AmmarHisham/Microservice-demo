package com.cg.app.feignclient;

import java.util.List;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cg.app.feignclient.modal.Product;

@FeignClient("PRODUCT-SERVICE")
@Transactional
public interface ProductAccessor {

	@PostMapping("/reduceQty")
	public Product getReducedQtyProductList(@RequestBody String productPayload);

	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public List<Product> getProductList();

}
