package com.androidserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.androidserver.entity.PlaylistEntity;
import com.androidserver.reponsitory.PlaylistReponsitory;

@Service
public class PlaylistService {

	@Autowired 
	private PlaylistReponsitory playlistReponsitory;
	
	public List<PlaylistEntity	> findAll() {
		return playlistReponsitory.findAll();
	}
	
	

}
