package com.androidserver.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.androidserver.entity.AlbumEntity;

public interface AlbumReponsitory extends JpaRepository<AlbumEntity, Long>{
	
	
}
