package com.example.backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.Token;
import com.example.backend.model.User;

@RestController
public class UserController {
	
	@PostMapping("/login")
	public Token login() {
		Token token = new Token();
		token.setToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoia2lzaG9yZSIsImVtYWlsIjoia2lzaG9yZUBnbWFpbC5jb20ifQ.aTCEGKEwjeabwJV_CFP_De_0td8tcRzWYZFB4Wse830");
		return token;
	}

	@PostMapping("/register")
	public User register(@RequestBody User user) {
		user.setId("1");
		return user;
	}
}
