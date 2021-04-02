package com.androidserver.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {

	@Column
	private String code;

	@Column
	private String name;


	@OneToMany(mappedBy = "roleEntity")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private List<UserEntity> users = new ArrayList<>();
	
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}

}
