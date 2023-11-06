package com.sagar.generics.example2;

import java.util.ArrayList;
import java.util.List;

public class SongV2 implements Comparable<SongV2>{

    private String title;
    private String artist;
    private int bpm;

    public SongV2(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }


    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(SongV2 o) {
        return this.title.compareTo(o.title);
    }
}


