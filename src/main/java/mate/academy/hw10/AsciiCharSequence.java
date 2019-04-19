package mate.academy.hw10;

import java.lang.CharSequence;
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    public byte[] arr;

    public AsciiCharSequence(byte[] arr) {
        this.arr = arr;
    }

    @Override
    public int length() {
        return arr.length;
    }

    @Override
    public char charAt(int index) {
        return (char) arr[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        return new AsciiCharSequence(Arrays.copyOfRange(arr, start, end)) {
        };
    }

    @Override
    public String toString() {
        return new String(arr);
    }
}
