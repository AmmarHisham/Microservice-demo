package com.cg.app.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class ProductResource {

	@Value("${product.owner:Adsales}")
	String productOwner;

	public String getProductOwner() {
		return productOwner;
	}

}
