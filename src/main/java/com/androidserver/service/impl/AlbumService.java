package com.androidserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.androidserver.entity.AlbumEntity;
import com.androidserver.reponsitory.AlbumReponsitory;

@Service
public class AlbumService {

	@Autowired 
	private AlbumReponsitory albumReponsitory;
	
	public List<AlbumEntity> findAll() {
		return albumReponsitory.findAll();
	}
	
	

}
