package mate.academy.less02.hashcode;

import java.util.Objects;

public class BlackBox {
    int varA;
    int varB;

    public BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlackBox blackBox = (BlackBox) o;
        return varA == blackBox.varA &&
                varB == blackBox.varB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(varA, varB);
    }
}
