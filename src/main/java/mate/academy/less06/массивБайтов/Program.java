package mate.academy.less06.массивБайтов;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Program {
    public static void main(String[] args) {
//        byte[] array1 = new byte[]{1, 3, 5, 6};
//
//        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
//        int b;
//        while ((b = byteStream1.read()) != -1) {
//            System.out.println(b);
//        }


        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello Wolrd!";
        byte[] buffer = text.getBytes();
        try {
            baos.write(buffer);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // превращаем массив байтов в строку
        System.out.println(baos.toString());

        // получаем массив байтов и выводим по символьно
        byte[] array = baos.toByteArray();
        for(byte b: array){

            System.out.print((char)b);
        }
        System.out.println();
    }
}