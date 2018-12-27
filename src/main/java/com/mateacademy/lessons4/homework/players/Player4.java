package com.mateacademy.lessons4.homework.players;

import com.mateacademy.lessons4.homework.PlayAllSongAbst;

public class Player4 extends PlayAllSongAbst {
    @Override
    public void playAllSong() {
        System.out.print("Playing4: ");
        for (String song : songs) {
            System.out.print(song + ", ");
        }
        System.out.println();
    }

    @Override
    public void playSong() {
        int length = songs.length;
        System.out.println("Playing4: " + songs[length-1]);
    }

    public Player4(int price) {
        super(price);
    }
}
