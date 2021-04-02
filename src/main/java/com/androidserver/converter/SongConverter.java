package com.androidserver.converter;

import org.springframework.stereotype.Component;

import com.androidserver.dto.SongDTO;
import com.androidserver.entity.SongEntity;

@Component
public class SongConverter {

	public SongEntity dtoToEntity(SongDTO dto, SongEntity songEntity) {

		songEntity.setSongName(dto.getSongName());
		songEntity.setLikes(dto.getLikes());
		songEntity.setUrlPicture(dto.getUrlPicture());
		songEntity.setUrlSong(dto.getUrlSong());
		return songEntity;

	}

	public  SongEntity dtoToEntity(SongDTO dto) {
		SongEntity songEntity = new SongEntity();
		songEntity.setSongName(dto.getSongName());
		songEntity.setLikes(dto.getLikes());
		songEntity.setUrlPicture(dto.getUrlPicture());
		songEntity.setUrlSong(dto.getUrlSong());
		return songEntity;

	}

	public SongDTO entityToDTO(SongEntity entity) {
		SongDTO dto = new SongDTO();
		if (entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setSongName(entity.getSongName());
		dto.setLikes(entity.getLikes());
		dto.setUrlPicture(entity.getUrlPicture());
		dto.setUrlSong(entity.getUrlSong());

		return dto;
	}
}
