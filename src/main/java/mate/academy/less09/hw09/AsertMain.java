package mate.academy.less09.hw09;

import java.io.IOException;

public  class AsertMain {
    public static void main(String[] args) throws IOException {
        test();
    }

    public static void test() throws IOException {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IOException();
        }

    }

}


