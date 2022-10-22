package com.example.springboot.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.User;
import com.example.springboot.service.UserService;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@GetMapping("user/all")
	ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok(userService.findAll());
	}
}
