package com.androidserver.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "topic")
public class TopicEntity extends BaseEntity {

	@Column
	private String name;

	@Column(name = "urltopicpicture")
	private String urlTopicPicture;

	@ManyToMany(mappedBy = "topics")
	private List<SongEntity> songs = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrlTopicPicture() {
		return urlTopicPicture;
	}

	public void setUrlTopicPicture(String urlTopicPicture) {
		this.urlTopicPicture = urlTopicPicture;
	}

	public List<SongEntity> getSongs() {
		return songs;
	}

	public void setSongs(List<SongEntity> songs) {
		this.songs = songs;
	}

}
