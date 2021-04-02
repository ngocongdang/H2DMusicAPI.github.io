package com.androidserver.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {

	@Column(name = "mame")
	private String name;

	@Column
	private String code;

	@Column(name = "urlcategorypicture")
	private String urlCategoryPicture;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "category")
	private List<SongEntity> songs = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrlPicture() {
		return urlCategoryPicture;
	}

	public void setUrlPicture(String urlPicture) {
		this.urlCategoryPicture = urlPicture;
	}

	public List<SongEntity> getSongs() {
		return songs;
	}

	public void setSongs(List<SongEntity> songs) {
		this.songs = songs;
		
        for(SongEntity s : songs) {
            s.setCategory(this);
        }
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUrlCategoryPicture() {
		return urlCategoryPicture;
	}

	public void setUrlCategoryPicture(String urlCategoryPicture) {
		this.urlCategoryPicture = urlCategoryPicture;
	}

}
