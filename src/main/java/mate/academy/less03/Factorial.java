package mate.academy.less03;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(1);
        for(int i=1; i<=value; i++){
            BigInteger result1 = BigInteger.valueOf(i);
            result=result.multiply(result1);
        }
        return result; // your implementation here
    }
}
