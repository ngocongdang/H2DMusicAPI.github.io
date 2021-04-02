package com.androidserver.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.androidserver.dto.SongDTO;
import com.androidserver.entity.SongEntity;
import com.androidserver.service.impl.SongService;

@RestController
public class SongAPI {

	@Autowired
	private SongService songService;


	@GetMapping("/song")
	public ResponseEntity<List<SongEntity>> findAll() {
		return ResponseEntity.ok(songService.findAll());
	}

	@GetMapping(value = "/song/{categoryID}")
	public ResponseEntity<List<SongEntity>> search(@PathVariable("categoryID") Long categoryID) {

		return ResponseEntity.ok(songService.getSongByCode(categoryID));
	}

	@GetMapping(value = "/song/singer/{singerID}")
	public ResponseEntity<List<SongEntity>> searchBySinger(@PathVariable("singerID") Long singerID) {

		return ResponseEntity.ok(songService.getSongBySingerId(singerID));
	}

	@PostMapping("/song")
	public ResponseEntity<String> createSong(@RequestBody SongDTO songDTO) {
		songService.save(songDTO);
		return ResponseEntity.ok("ok");
	}

	@PutMapping(value = "/song")
	public ResponseEntity<String> updateSong(@RequestBody SongDTO model) {
		songService.save(model);
		return ResponseEntity.ok("ok");
	}

	@DeleteMapping(value = "/song/{id}")
	public ResponseEntity<List<SongEntity>> deleteSong(@PathVariable("id") Long id) {
		Optional<SongEntity>thisIdSong = songService.findById(id);
		 if (!thisIdSong.isPresent()) {
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        }
	        songService.deleteSongById(id);
	        return ResponseEntity.ok(songService.findAll());
		
	}
	
	@GetMapping(value = "/album/song/album/{albumId}")
	public ResponseEntity<List<SongEntity>> searchByAlbum(@PathVariable("albumId") Long albumId) {

		return ResponseEntity.ok(songService.findSongByAlbumId(albumId));
	}
	
	@GetMapping(value = "/album/song/topic/{topicID}")
	public ResponseEntity<List<SongEntity>> searchByTopic(@PathVariable("topicID") Long topicID) {

		return ResponseEntity.ok(songService.findSongByTopicId(topicID));
	}
	
	
	@GetMapping(value = "/album/song/playlist/{playlistID}")
	public ResponseEntity<List<SongEntity>> searchByPlaylist(@PathVariable("playlistID") Long playlistID) {

		return ResponseEntity.ok(songService.findSongByPlaylistId(playlistID));
	}
}
