package com.androidserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.androidserver.converter.UserConverter;
import com.androidserver.dto.UserDTO;
import com.androidserver.entity.RoleEntity;
import com.androidserver.entity.UserEntity;
import com.androidserver.reponsitory.RoleReponsitory;
import com.androidserver.reponsitory.UserReponsitory;

@Service
public class UserService {

	@Autowired
	private UserReponsitory userReponsitory;
	
	@Autowired
	private  UserConverter userConverter;
	
	@Autowired
	private RoleReponsitory roleReponsitory;

	public List<UserEntity> findAll() {
		return userReponsitory.findAll();
	}
	
	public String findByUsername(String username) {
		 return userReponsitory.findByUsername(username);
		 
	}
//
//	public List<SongEntity> getSongByCode(Long CategoryId) {
//		return songReponsitory.getSongByCode(CategoryId);
//	}
//
//	public List<SongEntity> getSongBySingerId(Long singerId) {
//		return songReponsitory.getSongByCode(singerId);
//	}
//
	public void save(UserDTO stock) {
    	UserEntity userEntity = new UserEntity();
    	if(stock.getId() !=null) {
    		UserEntity oldEntity = userReponsitory.findOne(stock.getId());
    		userEntity = userConverter.dtoToEntity(stock, oldEntity);
    	}else {
    		userEntity = userConverter.dtoToEntity(stock);
		}
    	RoleEntity roleEntity = roleReponsitory.findOne(stock.getRoleId());
    	userEntity.setRoleEntity(roleEntity);
    	userReponsitory.save(userEntity);
    }
//	
//	public void deleteSongById(Long id) {
//		songReponsitory.deleteSongById(id);
//	}

}
