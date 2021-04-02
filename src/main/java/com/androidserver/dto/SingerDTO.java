package com.androidserver.dto;

public class SingerDTO  extends AbstractDTO<SingerDTO>{
	private String singerName;
	private String urlSingerPicture;

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getUrlSingerPicture() {
		return urlSingerPicture;
	}

	public void setUrlSingerPicture(String urlSingerPicture) {
		this.urlSingerPicture = urlSingerPicture;
	}

}
