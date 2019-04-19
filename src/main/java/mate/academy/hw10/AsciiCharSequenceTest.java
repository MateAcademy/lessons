package mate.academy.hw10;

public class AsciiCharSequenceTest {
    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString()); //Hello!
        System.out.println("Размер её - " + answer.length()); //6
        System.out.println("Символ под № 1 - " + answer.charAt(1)); //e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5)); //ello
    }
}
