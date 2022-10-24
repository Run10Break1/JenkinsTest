package com.example.springboot.service;

import java.util.List;
import java.util.Optional;

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
	
	public User findById(Long userId) {
		Optional<User> userOptional = userRepository.findById(userId);
		
		if(userOptional.isPresent()) {
			return userOptional.get();
		} else {
			throw new RuntimeException(String.format("%d를 가진 회원은 존재하지 않습니다.", userId));
		}
	}
	
	public List<User> findByAge(Integer age) {
		return userRepository.findAllByAge(age);
	}
}
