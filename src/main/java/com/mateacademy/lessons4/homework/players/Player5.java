package com.mateacademy.lessons4.homework.players;

import com.mateacademy.lessons4.homework.PlayAllSongAbst;

public class Player5 extends PlayAllSongAbst {
    @Override
    public void playAllSong() {
        System.out.print("Playing5: ");
        for (int i=songs.length-1; i>-1; i--)
        {
            System.out.print(songs[i] + ", ");
            }
            System.out.println();


    }

    @Override
    public void playSong() {

        if (songs.length>0)
        System.out.println("Playing5: " + songs[0]);

    }

    public Player5(int price) {
        super(price);
    }
}
