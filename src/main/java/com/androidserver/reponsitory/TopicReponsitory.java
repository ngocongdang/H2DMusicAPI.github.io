package com.androidserver.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.androidserver.entity.TopicEntity;

public interface TopicReponsitory extends JpaRepository<TopicEntity, Long>{
	
	
}
