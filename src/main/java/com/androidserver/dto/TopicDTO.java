package com.androidserver.dto;

public class TopicDTO extends AbstractDTO<TopicDTO> {
	private String topicName;
	private String urlTopicPicture;

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getUrlTopicPicture() {
		return urlTopicPicture;
	}

	public void setUrlTopicPicture(String urlTopicPicture) {
		this.urlTopicPicture = urlTopicPicture;
	}

}
