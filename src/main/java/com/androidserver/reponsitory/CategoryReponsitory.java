package com.androidserver.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.androidserver.entity.CategoryEntity;

public interface CategoryReponsitory extends JpaRepository<CategoryEntity, Long>{

}
