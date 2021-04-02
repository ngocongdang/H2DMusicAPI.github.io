package com.androidserver.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "album")
public class AlbumEntity extends BaseEntity{

	@Column
	private String name;

	@Column(name = "urlalbumpicture")
	private String urlAlbumPicture;

	@ManyToMany
	@JoinTable(name = "album_singer", joinColumns = @JoinColumn(name = "album_id"), inverseJoinColumns = @JoinColumn(name = "singer_id"))
	private List<SingerEntity> singers = new ArrayList<>();

	@ManyToMany(mappedBy = "albums")
	private List<SongEntity> songs = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrlAlbumPicture() {
		return urlAlbumPicture;
	}

	public void setUrlAlbumPicture(String urlAlbumPicture) {
		this.urlAlbumPicture = urlAlbumPicture;
	}

	public List<SingerEntity> getSingers() {
		return singers;
	}

	public void setSingers(List<SingerEntity> singers) {
		this.singers = singers;
	}

	public List<SongEntity> getSongs() {
		return songs;
	}

	public void setSongs(List<SongEntity> songs) {
		this.songs = songs;
	}

}
