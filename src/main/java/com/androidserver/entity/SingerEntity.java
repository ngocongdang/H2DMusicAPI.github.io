																																																																																																																																																																																																																																																																																																																package com.androidserver.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "singer")
public class SingerEntity extends BaseEntity {

	@Column
	private String name;

	@Column(name = "urlsingerpicture")
	private String urlSingerPicture;

	public List<SongEntity> getSongs() {
		return songs;
	}

	public void setSongs(List<SongEntity> songs) {
		this.songs = songs;
	}

	@OneToMany(mappedBy = "singers")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private List<SongEntity> songs = new ArrayList<>();
	
	

	
	@ManyToMany(mappedBy = "singers")
	private List<AlbumEntity> albums = new ArrayList<>();
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrlSingerPicture() {
		return urlSingerPicture;
	}

	public void setUrlSingerPicture(String urlSingerPicture) {
		this.urlSingerPicture = urlSingerPicture;
	}


	public List<AlbumEntity> getAlbums() {
		return albums;
	}

	public void setAlbums(List<AlbumEntity> albums) {
		this.albums = albums;
	}

}
