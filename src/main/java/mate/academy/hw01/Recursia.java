package mate.academy.hw01;

public class Recursia {
    public static void main(String[] args) {
        System.out.println("Fact(4) = " + fact(4));
        System.out.println("Fibo(7) = " + fibo(7));
        System.out.println("CosTaylor(3,3) = " + getCosTaylor(3,3));
        System.out.println("SinTaylor(4,4) = " + getSinTaylor(4,4));
    }

    private static int fact(int num){
        if (num == 0){
            return 1;
        }
        return fact(num - 1) * num;
    }

    private static int fibo(int num){
        if (num == 1 || num ==2){
            return 1;
        }
        return fibo(num - 1) + fibo(num - 2);
    }

    private static double getCosTaylor(double y, double x){
        if(y > 999){
            return 1;
        }
        return 1 - x *x / ((2 * y - 1) * 2 * y) * getCosTaylor(y+1, x);
    }

    private static double getSinTaylor(double y, double x){
        return getCosTaylor (y, x - 1.569);
    }

}