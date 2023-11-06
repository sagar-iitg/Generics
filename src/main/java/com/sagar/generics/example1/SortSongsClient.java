package com.sagar.generics.example1;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SortSongsClient {
    public static void main(String[] args) {
        new SortSongsClient().printSong();
    }

    private void printSong() {

        List<String > songList=MockSongs.getSongStrings();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

    }
}
