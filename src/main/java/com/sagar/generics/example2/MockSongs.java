package com.sagar.generics.example2;

import java.util.ArrayList;
import java.util.List;

public class MockSongs{

    public static List<SongV2> getSongStrings(){

        List<SongV2> songs=new ArrayList<>();
        songs.add(new SongV2("somersault","zero",147));
        songs.add(new SongV2("dfnjfn","shreya",167));
        songs.add(new SongV2("mmdnvjn","madhavan",177));
        songs.add(new SongV2("dknfnjr","ankit",47));
        songs.add(new SongV2("poiu","piyush",98));
        songs.add(new SongV2("orpeieh","xmdnnf",24));

        return songs;
    }
}