package com.androidserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.androidserver.entity.TopicEntity;
import com.androidserver.reponsitory.TopicReponsitory;

@Service
public class TopicService {

	@Autowired 
	private TopicReponsitory topicReponsitory;
	
	public List<TopicEntity> findAll() {
		return topicReponsitory.findAll();
	}
	
	

}
