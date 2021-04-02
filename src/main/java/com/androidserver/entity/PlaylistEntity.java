package com.androidserver.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "playlist")
public class PlaylistEntity extends BaseEntity {
	
	@Column
	private String name;
	
	@Column(name = "urlplaylistPicture")
	private String urlPlaylistPicture;
	
	@Column(name = "urlicon")
	private String urlIcon;
	
	@ManyToMany(mappedBy = "playlits")
	private List<SongEntity> songs = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrlPlaylistPicture() {
		return urlPlaylistPicture;
	}

	public void setUrlPlaylistPicture(String urlPlaylistPicture) {
		this.urlPlaylistPicture = urlPlaylistPicture;
	}

	public String getUrlIcon() {
		return urlIcon;
	}

	public void setUrlIcon(String urlIcon) {
		this.urlIcon = urlIcon;
	}

	public List<SongEntity> getSongs() {
		return songs;
	}

	public void setSongs(List<SongEntity> songs) {
		this.songs = songs;
	}
	
	
}
