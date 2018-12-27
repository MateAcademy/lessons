package com.mateacademy.lessons4.homework.players;

import com.mateacademy.lessons4.homework.PlayAllSongAbst;

public class Player3 extends PlayAllSongAbst {

    @Override
    public void playAllSong() {
        System.out.print("Playing3: ");
        for (String song : songs) {
            System.out.print(song + ", ");
        }
        System.out.println();

    }

    @Override
    public void playSong() {
        System.out.print("Playing3: ");
        for (String song : songs) {
            System.out.println(song);
            break;
        }
    }

    public Player3(int price) {
        super(price);
    }
}
