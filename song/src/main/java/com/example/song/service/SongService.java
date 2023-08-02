package com.example.song.service;

import com.example.song.model.Song;
import com.example.song.repository.ISongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService{
    @Autowired
    private ISongRepo songRepo;
    @Override
    public List<Song> getSongs() {
        return songRepo.getSongs();
    }

    @Override
    public void create(Song song) {
        songRepo.createSong(song);
    }

    @Override
    public void delete(int id) {
        songRepo.deleteSong(id);
    }

    @Override
    public void update(int id) {
        songRepo.updateSong(id);
    }

    @Override
    public List<Song> getSong(String name) {
        return songRepo.getSongSearch(name);
    }

    @Override
    public Song getSong(int id) {
        return songRepo.getSong(id);
    }

    @Override
    public List<Song> getSongPage(int page, int limit) {
        return songRepo.getSongPage(page*limit+1,limit);
    }
}
