package com.example.song;

import com.example.song.model.Song;
import com.example.song.model.Status;
import com.example.song.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SongApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SongApplication.class, args);
    }

    @Autowired
    private ISongService songService;

    @Override
    public void run(String... args) throws Exception {

    }
}
