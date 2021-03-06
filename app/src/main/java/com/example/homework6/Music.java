package com.example.homework6;

public class Music {
    private String singer;
    private String music;
    private String time;
    private String number;

    public Music(String singer, String music, String time, String number) {
        this.singer = singer;
        this.music = music;
        this.time = time;
        this.number = number;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
