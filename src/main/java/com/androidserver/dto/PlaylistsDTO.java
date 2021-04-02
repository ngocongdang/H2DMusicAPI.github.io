package com.androidserver.dto;

public class PlaylistsDTO extends AbstractDTO<PlaylistsDTO> {
	private String playListName;
	private String urlBackground;
	private String urlIcon;

	public String getPlayListName() {
		return playListName;
	}

	public void setPlayListName(String playListName) {
		this.playListName = playListName;
	}

	public String getUrlBackground() {
		return urlBackground;
	}

	public void setUrlBackground(String urlBackground) {
		this.urlBackground = urlBackground;
	}

	public String getUrlIcon() {
		return urlIcon;
	}

	public void setUrlIcon(String urlIcon) {
		this.urlIcon = urlIcon;
	}

}
