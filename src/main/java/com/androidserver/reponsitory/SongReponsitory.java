package com.androidserver.reponsitory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.androidserver.entity.SongEntity;

public interface SongReponsitory extends JpaRepository<SongEntity, Long> {
	
	@Query(value = "select * from song s inner join song_album sa on s.id = sa.song_id where sa.album_id =?1", nativeQuery = true)
	List<SongEntity> findSongByAlbumId(Long id);
	
	@Query(value = "select * from song s inner join song_topic st on s.id = st.song_id where st.topic_id =?1", nativeQuery = true)
	List<SongEntity> findSongByTopicId(Long id);
	
	@Query(value = "select * from song s inner join song_playlist st on s.id = st.song_id where st.playlist_id =?1", nativeQuery = true)
	List<SongEntity> findSongByPlaylistId(Long id);

	@Query("select s from SongEntity s")
	List<SongEntity> getAllSong();
	
	@Query(value = "SELECT * FROM song  WHERE id=?1", nativeQuery = true)
	Optional<SongEntity> findById(Long id);

	@Query(value = "SELECT * FROM song  WHERE categoty_id=?1", nativeQuery = true)
	List<SongEntity> getSongByCode(Long categoryId);

	@Query(value = "select * from song  where singer_id=?1", nativeQuery = true)
	List<SongEntity> getSongBySingerID(Long singerId);

	 @Transactional
	    @Modifying
	    @Query(value = "DELETE FROM  song  WHERE  id=?1", nativeQuery = true)
	    void deleteSongById(Long id);
}
