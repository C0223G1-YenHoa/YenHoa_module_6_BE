package com.example.song.controller;

import com.example.song.model.Song;
import com.example.song.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/songs")
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping()
    public List<Song> getList(){
        return songService.getSongs();
    }

    @GetMapping("/page/{pages}/{limit}")
    public List<Song> getListPage(@PathVariable int pages,@PathVariable int limit){
        return songService.getSongPage(pages, limit);
    }

    @PostMapping()
    @CrossOrigin("*")
    public ResponseEntity<?> create(@RequestBody Song song){
        songService.create(song);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        songService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable int id){
        songService.update(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public List<Song> getSongSearch(@PathVariable String name){
       return songService.getSong(name);
    }

    @GetMapping("/searchId/{id}")
    public Song getSong(@PathVariable int id){
       return songService.getSong(id);
    }
}
