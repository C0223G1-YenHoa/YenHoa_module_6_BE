package com.example.song.dto;

import com.example.song.model.Status;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


public class SongDto {
    @NotBlank
    private String song;
    @NotBlank

    private String singer;
    @NotBlank
    private String time;
    @NotBlank
    private int tym;
    @NotBlank
    private Status status;

    public SongDto() {
    }

    public SongDto(String song, String singer, String time, int tym, Status status) {

        this.song = song;
        this.singer = singer;
        this.time = time;
        this.tym = tym;
        this.status = status;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
