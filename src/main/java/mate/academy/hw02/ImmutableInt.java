package mate.academy.hw02;

public class ImmutableInt {
    private final int value;
    private int size;

    public ImmutableInt(int i, int size) {
        value = i;
        this.size = size;
    }

    public int getValue() {
        return value;
    }

    public int getSize() {
        return size;
    }
}