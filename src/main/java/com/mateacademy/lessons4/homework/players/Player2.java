package com.mateacademy.lessons4.homework.players;

import com.mateacademy.lessons4.homework.PlaySongAbst;

public class Player2 extends PlaySongAbst {
    @Override
    public void playSong() {
        System.out.println("error");
    }

    public Player2(int price) {
        super(price);
    }
}
