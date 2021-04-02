package com.androidserver.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.androidserver.dto.UserDTO;
import com.androidserver.entity.UserEntity;
import com.androidserver.service.impl.UserService;

@RestController
public class UserAPI {
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public ResponseEntity<List<UserEntity>> findAll() {
		return ResponseEntity.ok(userService.findAll());
	}
	
	@GetMapping(value = "/user/{username}")
	public ResponseEntity<String> search(@PathVariable("username") String username) {

		return ResponseEntity.ok(userService.findByUsername(username));
	}
	
	@PostMapping("/user")
	public ResponseEntity<String> createSong(@RequestBody UserDTO userDTO) {
		userService.save(userDTO);
		return ResponseEntity.ok("ok");
	}

	@PutMapping(value = "/user")
	public ResponseEntity<String> updateSong(@RequestBody UserDTO model) {
		userService.save(model);
		return ResponseEntity.ok("ok");
	}
}
