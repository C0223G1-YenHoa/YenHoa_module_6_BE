package com.example.song.model;

import javax.persistence.*;

@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String song;
    private String singer;
    private String timer;
    private int tym;
    @ManyToOne
    @JoinColumn(name = "status_id",nullable = false)
    private Status status;

    public Song() {
    }

    public Song(int id, String song, String singer, String time, int tym, Status status) {
        this.id = id;
        this.song = song;
        this.singer = singer;
        this.timer = time;
        this.tym = tym;
        this.status = status;
    }

    public Song(String song, String singer, String time, int tym, Status status) {
        this.song = song;
        this.singer = singer;
        this.timer = time;
        this.tym = tym;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public int getTym() {
        return tym;
    }

    public void setTym(int tym) {
        this.tym = tym;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
