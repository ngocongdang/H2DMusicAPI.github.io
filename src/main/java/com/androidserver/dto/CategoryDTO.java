package com.androidserver.dto;

public class CategoryDTO extends AbstractDTO<CategoryDTO> {

	private String categoryName;
	private String urlCategoryPicture;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getUrlCategoryPicture() {
		return urlCategoryPicture;
	}

	public void setUrlCategoryPicture(String urlCategoryPicture) {
		this.urlCategoryPicture = urlCategoryPicture;
	}

}
