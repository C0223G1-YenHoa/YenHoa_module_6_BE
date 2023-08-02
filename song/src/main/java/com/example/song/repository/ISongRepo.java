package com.example.song.repository;

import com.example.song.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ISongRepo extends JpaRepository<Song, Integer> {
    @Query(value = "select * from songs", nativeQuery = true)
    List<Song> getSongs();
    @Modifying
    @Query(value = "INSERT INTO songs (song, singer, timer, tym,status_id)" +
            "VALUES (:#{#song.song},:#{#song.singer},:#{#song.timer},:#{#song.tym},:#{#song.status.id});", nativeQuery = true)
    void createSong(@Param("song") Song song);
    @Modifying
    @Query(value = "delete from songs where id=:id",nativeQuery = true)
    void deleteSong(@Param("id")int id);

    @Modifying
    @Query(value = "UPDATE songs  set status_id= 2 where id=:id",nativeQuery = true)
    void updateSong(@Param("id")int id);


    @Query(value = "select * from songs where song like concat('%',:name,'%')",nativeQuery = true)
    List<Song> getSongSearch(@Param("name")String name);

    @Query(value = "select * from songs where id=:id",nativeQuery = true)
    Song getSong(@Param("id")int id);

    @Query(value = "select * from songs limit :page, :limit ",nativeQuery = true)
    List<Song> getSongPage(int page,int limit);
}
