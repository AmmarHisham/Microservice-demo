package com.cg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.feignclient.modal.ResponseModel;
import com.cg.app.resource.User;
import com.cg.app.service.UserBookService;
import com.cg.app.service.UserService;

@RestController
public class UserController {

	@Autowired
	private User user;

	@Autowired
	UserService userService;

	@Autowired
	UserBookService userBookService;

	@RequestMapping("/")
	public String userHomeScreen() {
		return String.format("User Service is running");
	}

	@GetMapping("/login")
	public ResponseEntity restaurant(@RequestParam("userName") String userName) {

		if (userName.equals(user.getUserName())) {
			return new ResponseEntity(userService.getProductList(), HttpStatus.OK);
		} else {
			return new ResponseEntity("Invalid User", HttpStatus.NON_AUTHORITATIVE_INFORMATION);
		}
	}

	@PostMapping("/bookProduct")
	public ResponseModel bookProduct(@RequestBody String payload) {
		ResponseModel s = userBookService.bookOrder(payload);
		return s;

	}

}
