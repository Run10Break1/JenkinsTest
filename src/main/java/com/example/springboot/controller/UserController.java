package com.example.springboot.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.User;
import com.example.springboot.service.UserService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@GetMapping("/all")
	ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok(userService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable("id") Long userId) {
		return ResponseEntity.ok(userService.findById(userId));
	}
	
	@GetMapping("/age/{age}")
	public ResponseEntity<List<User>> findByCondition(@PathVariable("age") Integer age) {
		return ResponseEntity.ok(userService.findByAge(age));
	}
	
	@GetMapping("")
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("hello world!");
	}
}
