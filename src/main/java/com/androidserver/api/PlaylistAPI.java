package com.androidserver.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.androidserver.entity.PlaylistEntity;
import com.androidserver.service.impl.PlaylistService;

@RestController
public class PlaylistAPI {

	@Autowired 
	private PlaylistService playlistService;
	
	@GetMapping("/playlist")
	public ResponseEntity<List<PlaylistEntity>> findAll(){
		return ResponseEntity.ok(playlistService.findAll());
	}
	
}
