package com.androidserver.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.androidserver.entity.TopicEntity;
import com.androidserver.service.impl.TopicService;

@RestController
public class TopicAPI {

	@Autowired 
	private TopicService topicService;
	
	@GetMapping("/topic")
	public ResponseEntity<List<TopicEntity>> findAll(){
		return ResponseEntity.ok(topicService.findAll());
	}
	
}
