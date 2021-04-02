package com.androidserver.converter;

import org.springframework.stereotype.Component;

import com.androidserver.dto.UserDTO;
import com.androidserver.entity.UserEntity;

@Component
public class UserConverter {

	public UserEntity dtoToEntity(UserDTO dto, UserEntity userEntity) {

		userEntity.setFullName(dto.getFullName());
		userEntity.setPassword(dto.getPassword());
		userEntity.setStatus(dto.getStatus());
		userEntity.setUserName(dto.getUserName());
		return userEntity;

	}

	public  UserEntity dtoToEntity(UserDTO dto) {
		UserEntity userEntity = new UserEntity();
		userEntity.setFullName(dto.getFullName());
		userEntity.setPassword(dto.getPassword());
		userEntity.setStatus(dto.getStatus());
		userEntity.setUserName(dto.getUserName());
		return userEntity;

	}

	public UserDTO entityToDTO(UserEntity entity) {
		UserDTO dto = new UserDTO();
		if (entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setFullName(entity.getFullName());
		dto.setPassword(entity.getPassword());
		dto.setStatus(entity.getStatus());
		dto.setUserName(entity.getUserName());
		return dto;
	}
}
