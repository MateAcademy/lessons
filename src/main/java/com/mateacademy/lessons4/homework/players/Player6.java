package com.mateacademy.lessons4.homework.players;

import com.mateacademy.lessons4.homework.PlayAllSongAbst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player6 extends PlayAllSongAbst {
    @Override
    public void playAllSong() {
        System.out.print("Playing6: ");
        for (String song : songs) {
            System.out.print(song + ", ");
        }
        System.out.println();
    }

    @Override
    public void playSong() {
        if (songs.length>0)
            System.out.println("Playing6: " + songs[0]);
    }

    public void shuffle() {
        int l = songs.length;
        List<String> list = new ArrayList<>();
        for (String s: songs)
            list.add(s);
        Collections.shuffle(list);

        System.out.print("Randome Playing6: ");
        for (String s: list)
            System.out.print(s + ", ");
    }

    public Player6(int price) {
        super(price);
    }
}
