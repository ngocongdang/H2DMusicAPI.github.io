package com.androidserver.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.androidserver.entity.SingerEntity;

public interface SingerReponsitory extends JpaRepository<SingerEntity, Long>{

}
