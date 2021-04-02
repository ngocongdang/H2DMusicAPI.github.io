package com.androidserver.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.androidserver.entity.PlaylistEntity;

public interface PlaylistReponsitory extends JpaRepository<PlaylistEntity, Long>{
	
	
}
