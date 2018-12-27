package com.mateacademy.lessons4.homework.players;

import com.mateacademy.lessons4.homework.PlaySongAbst;

public class Player1 extends PlaySongAbst {
    @Override
    public void playSong() {
        System.out.println("Playing1: " + defaultSong);
    }

    public Player1(int price) {
        super(price);
    }


}
