package com.mateacademy.lessons4.homework;


import com.mateacademy.lessons4.homework.players.*;

public class Main {
    public static void main(String[] args) {
        Player1 player1 =new Player1(70);
        player1.playSong();

        Player2 player2 = new Player2(150);
        player2.playSong();

        Player3 player3 =new Player3(50);
        player3.playSong();
        player3.playAllSong();

        Player4 player4 =new Player4(60);
        player4.playSong();
        player4.playAllSong();

        Player5 player5 =new Player5(70);
        player5.playSong();
        player5.playAllSong();

        Player6 player6 =new Player6(70);
        player6.playSong();
        player6.playAllSong();
        player6.shuffle();

    }
}
