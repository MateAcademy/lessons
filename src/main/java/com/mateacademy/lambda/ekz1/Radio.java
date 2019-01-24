package com.mateacademy.lambda.ekz1;

public class Radio implements ElectricityConsumer{

    public void playMuzic() {
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn( Object sender) {
        playMuzic();
    }
}
