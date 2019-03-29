package mate.academy.hw3;

public class Union {
    public static void main(String[] args) {

        int[] a1 = new int[] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] a2 = new int[] {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};

        int[] result = mergeArrays(a1,a2);

        for (int a : result) {
            System.out.print(a + " ");
        }
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];

        int firstElemA1=0, firstElemA2=0;
        for (int k=0; k<result.length; k++) {

            if (firstElemA1 > a1.length-1) {
                result[k] = a2[firstElemA2];
                firstElemA2++;
            }
            else if (firstElemA2 > a2.length-1) {
                result[k] = a1[firstElemA1];
                firstElemA1++;
            }
            else if (a1[firstElemA1] < a2[firstElemA2]) {
                result[k] = a1[firstElemA1];
                firstElemA1++;
            }
            else {
                result[k] =a2[firstElemA2];
                firstElemA2++;
            }
        }
        return result;
    }
}
