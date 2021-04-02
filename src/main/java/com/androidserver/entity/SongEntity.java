package com.androidserver.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "song")
public class SongEntity extends BaseEntity {

	@Column(name = "songname")
	private String songName;

	@Column(name = "urlpicture")
	private String urlPicture;

	@Column(name = "urlsong")
	private String urlSong;

	@Column(name = "likes")
	private Long likes;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "categoty_id", nullable = false)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private CategoryEntity category;

	@ManyToOne()
	@JoinColumn(name = "singer_id")
	//@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private SingerEntity singers;

	@ManyToMany
	@JoinTable(name = "song_album", joinColumns = @JoinColumn(name = "song_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "album_id", referencedColumnName = "id"))
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Set<AlbumEntity> albums;

	@ManyToMany
	@JoinTable(name = "song_playlist", joinColumns = @JoinColumn(name = "song_id"), inverseJoinColumns = @JoinColumn(name = "playlist_id"))
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Set<PlaylistEntity> playlits;

	@ManyToMany
	@JoinTable(name = "song_topic", joinColumns = @JoinColumn(name = "song_id"), inverseJoinColumns = @JoinColumn(name = "topic_id"))
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Set<TopicEntity> topics;

//	public SongEntity(String songName, String urlPicture, String urlSong, Long likes, SingerEntity...singers) {
//		this.singers = Stream.of(singers).collect(Collectors.toSet());
//        this.singers.forEach(x -> x.getSongs().add(this));
//	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getUrlPicture() {
		return urlPicture;
	}

	public void setUrlPicture(String urlPicture) {
		this.urlPicture = urlPicture;
	}

	public Long getLikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public SingerEntity getSingers() {
		return singers;
	}

	public void setSingers(SingerEntity singers) {
		this.singers = singers;
	}

	public Set<AlbumEntity> getAlbums() {
		return albums;
	}

	public void setAlbums(Set<AlbumEntity> albums) {
		this.albums = albums;
	}

	public Set<PlaylistEntity> getPlaylits() {
		return playlits;
	}

	public void setPlaylits(Set<PlaylistEntity> playlits) {
		this.playlits = playlits;
	}

	public Set<TopicEntity> getTopics() {
		return topics;
	}

	public void setTopics(Set<TopicEntity> topics) {
		this.topics = topics;
	}

	public String getUrlSong() {
		return urlSong;
	}

	public void setUrlSong(String urlSong) {
		this.urlSong = urlSong;
	}

}
