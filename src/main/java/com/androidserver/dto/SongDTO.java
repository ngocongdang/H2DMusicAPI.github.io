package com.androidserver.dto;

public class SongDTO extends AbstractDTO<SongDTO> {
	private String songName;
	private String urlPicture;
	private String urlSong;
	private Long likes;
	private Long categoryId;
	private Long singerId;
	//private List<AlbumDTO> albums;
//	private List<PlaylistsDTO> playlists;
//	private List<SingerDTO> singers;
//	private List<TopicDTO> topics;

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

	

	public String getUrlSong() {
		return urlSong;
	}

	public void setUrlSong(String urlSong) {
		this.urlSong = urlSong;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getSingerId() {
		return singerId;
	}

	public void setSingerId(Long singerId) {
		this.singerId = singerId;
	}



//	public List<AlbumDTO> getAlbums() {
//		return albums;
//	}
//
//	public void setAlbums(List<AlbumDTO> albums) {
//		this.albums = albums;
//	} 
////
//	public List<PlaylistsDTO> getPlaylists() {
//		return playlists;
//	}
//
//	public void setPlaylists(List<PlaylistsDTO> playlists) {
//		this.playlists = playlists;
//	}
//
//	public List<SingerDTO> getSingers() {
//		return singers;
//	}
//
//	public void setSingers(List<SingerDTO> singers) {
//		this.singers = singers;
//	}
//
//	public List<TopicDTO> getTopics() {
//		return topics;
//	}
//
//	public void setTopics(List<TopicDTO> topics) {
//		this.topics = topics;
//	}

}
