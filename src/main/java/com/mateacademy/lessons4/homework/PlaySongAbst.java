package com.mateacademy.lessons4.homework;

public abstract class PlaySongAbst implements PlaySong {
    final int price;

    public PlaySongAbst(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
