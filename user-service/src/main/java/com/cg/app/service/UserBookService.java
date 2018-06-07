package com.cg.app.service;

import com.cg.app.feignclient.modal.ResponseModel;

public interface UserBookService {

	ResponseModel bookOrder(String payload);
}
