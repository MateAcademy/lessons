package com.mateacademy.lessons7.exz3;

/**
 * Экзекюторы.
 */
public class CountThread implements Runnable {

    private CommonResourse res;

    private String name;

    public CountThread(CommonResourse res, String name) {
        this.res = res;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "waiting");


        try {
            for (int i = 0; i < 5; i++) {
                res.incrementValue();
                System.out.println(this.name + ":" + res.getValue());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());

        }
    }
}
