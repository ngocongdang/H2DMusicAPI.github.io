package com.androidserver.dto;

public class AlbumDTO extends AbstractDTO<AlbumDTO> {
	private String albumName;
	private String urlAlbumPicture;

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getUrlAlbumPicture() {
		return urlAlbumPicture;
	}

	public void setUrlAlbumPicture(String urlAlbumPicture) {
		this.urlAlbumPicture = urlAlbumPicture;
	}

}
