package com.androidserver.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.androidserver.converter.SongConverter;
import com.androidserver.dto.SongDTO;
import com.androidserver.entity.CategoryEntity;
import com.androidserver.entity.SingerEntity;
import com.androidserver.entity.SongEntity;
import com.androidserver.reponsitory.CategoryReponsitory;
import com.androidserver.reponsitory.SingerReponsitory;
import com.androidserver.reponsitory.SongReponsitory;
import com.androidserver.service.ISongService;

@Service
public class SongService implements ISongService {

	@Autowired
	private SingerReponsitory singerReponsitory;

	@Autowired
	private CategoryReponsitory categoryReponsitory;

	@Autowired
	private SongConverter songConverter;

	@Autowired
	private SongReponsitory songReponsitory;

	public List<SongEntity> findAll() {
		return songReponsitory.getAllSong();
	}
	
	public Optional<SongEntity> findById(Long id) {
		 return songReponsitory.findById(id);
		 
	}

	public List<SongEntity> getSongByCode(Long CategoryId) {
		return songReponsitory.getSongByCode(CategoryId);
	}

	public List<SongEntity> getSongBySingerId(Long singerId) {
		return songReponsitory.getSongByCode(singerId);
	}

	public void save(SongDTO stock) {
    	SongEntity songEntity = new SongEntity();
    	if(stock.getId() !=null) {
    		SongEntity oldEntity = songReponsitory.findOne(stock.getId());
    		songEntity = songConverter.dtoToEntity(stock, oldEntity);
    	}else {
    		songEntity = songConverter.dtoToEntity(stock);
		}
    	CategoryEntity categoryEntity = categoryReponsitory.findOne(stock.getCategoryId());
    	SingerEntity singerEntity = singerReponsitory.findOne(stock.getSingerId());
    	songEntity.setCategory(categoryEntity);
    	songEntity.setSingers(singerEntity);
    	songEntity =songReponsitory.save(songEntity);
    }
	
	public void deleteSongById(Long id) {
		songReponsitory.deleteSongById(id);
	}
	
	public List<SongEntity> findSongByAlbumId(Long id) {
		return songReponsitory.findSongByAlbumId(id);
	}
	
	public List<SongEntity> findSongByTopicId(Long id) {
		return songReponsitory.findSongByTopicId(id);
	}

	public List<SongEntity> findSongByPlaylistId(Long id) {
		return songReponsitory.findSongByPlaylistId(id);
	}
}
