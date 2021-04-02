package com.androidserver.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.androidserver.entity.RoleEntity;

public interface RoleReponsitory extends JpaRepository<RoleEntity, Long>{

}
