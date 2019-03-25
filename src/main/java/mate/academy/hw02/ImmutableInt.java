package mate.academy.hw02;

public class ImmutableInt {
    private final int value;

    public ImmutableInt(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }
}