package com.sagar.generics.example2;

import java.util.Collections;
import java.util.List;


public class SongV2Main {
    public static void main(String[] args) {
        new SongV2Main().printSong();
    }

    private void printSong() {

        List<SongV2 > songList= MockSongs.getSongStrings();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

    }
}
