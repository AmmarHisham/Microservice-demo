package com.cg.app.feignclient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.cg.app.feignclient.modal.Orders;

@FeignClient("ORDER-SERVICE")
@Transactional
public interface OrderAccessor {

	@PostMapping("/bookOrder")
	public Orders bookOrder(@RequestBody String payload);
	
	
}
