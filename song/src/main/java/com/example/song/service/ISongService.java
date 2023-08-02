package com.example.song.service;

import com.example.song.model.Song;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ISongService {
    List<Song> getSongs();
    void create(Song song);
    void delete(int id);
    void update(int id);
    List<Song> getSong(String name);
    Song getSong(int id);
    List<Song> getSongPage(int page,int limit);
}
