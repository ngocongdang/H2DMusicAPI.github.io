package com.androidserver.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.androidserver.entity.UserEntity;

public interface UserReponsitory extends JpaRepository<UserEntity	, Long> {

	@Query("select u from UserEntity u")
	List<UserEntity> getAllUser();
	
	@Query(value = "select * from user where username =?1", nativeQuery = true)
	String findByUsername(String username);

//	@Query(value = "SELECT * FROM song  WHERE categoty_id=?1", nativeQuery = true)
//	List<SongEntity> getSongByCode(Long categoryId);
//
//	@Query(value = "select * from song s1 inner join song_singer s2 on s1.id = s2.song_id where s2.singer_id=?1", nativeQuery = true)
//	List<SongEntity> getSongBySingerID(Long singerId);
//
//	 @Transactional
//	    @Modifying
//	    @Query(value = "DELETE FROM  song  WHERE  id=?1", nativeQuery = true)
//	    void deleteSongById(Long id);
}
