package com.example.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot.model.User;
import com.example.springboot.repository.UserRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
}
