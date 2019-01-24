package com.mateacademy.lambda.ekz1;

import static java.lang.System.out;

public class Program {
    public static void fire(Object sender) {
        out.println("Fire))");
    }


    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
//        sw.consumer = lamp;

        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        final String message = "Пожар";


        //Это анонимный класс, описание класса и создание обьекта этого класса
        sw.addElectricityListener(
                new ElectricityConsumer()
                {
                    @Override
                    public void electricityOn(Object sender)
                    {
                        out.println(message);
                        out.println("Пожар");
                        out.println("!!!");
                        out.println();
                    }
                }
            );


//фактически использование обьекта как функции
//        sw.addElectricityListener(  sender -> out.println("Fire"));

//        sw.addElectricityListener(  s -> ProgramUtill.fire(s) );
        sw.addElectricityListener(  s -> fire(s) );
        sw.addElectricityListener(  (s) -> fire(s) );
        sw.addElectricityListener(  Program::fire );


        sw.addElectricityListener(  sender2 -> {
            out.println("Fire2");
            out.println("!!!");
        });


//        class Fire implements ElectricityConsumer{
//            @Override
//            public void electricityOn() {
//                out.println("Пожар");
//            }
//        }
//        sw.addElectricityListener(new Fire());


        sw.switchon();
    }
}
