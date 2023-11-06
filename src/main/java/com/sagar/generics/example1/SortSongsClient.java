package com.sagar.generics.example1;

import java.util.List;

public class SortSongsClient {
    public static void main(String[] args) {
        new SortSongsClient().printSong();
    }

    private void printSong() {
        List<String > songList=MockSongs.getSongStrings();
        System.out.println(songList);
    }
}
