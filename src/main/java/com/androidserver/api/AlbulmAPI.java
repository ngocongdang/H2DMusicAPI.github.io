package com.androidserver.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.androidserver.entity.AlbumEntity;
import com.androidserver.service.impl.AlbumService;

@RestController
public class AlbulmAPI {

	@Autowired 
	private AlbumService albumService;
	
	@GetMapping("/album")
	public ResponseEntity<List<AlbumEntity>> findAll(){
		return ResponseEntity.ok(albumService.findAll());
	}
	
}
