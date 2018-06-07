package com.cg.app.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class User {
	
  @Value("${user.name:Ammar}")
  String userName;

  public String getUserName() {
    return userName;
  }


  
}
