package mate.academy.hw10;

import java.util.Objects;

public class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.re, re) == 0 &&
                Double.compare(that.im, im) == 0;
    }

//    @Override
//    public int hashCode() {
//        int k = 31;
//        int k2 = 2;
//        int rez = (int)(k+re + k2+ im);
//        return rez;
//    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
}