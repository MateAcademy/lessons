package mate.academy.less02.bufferedReader.tryWithResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Man2 {
    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = bufferedReader.readLine();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
