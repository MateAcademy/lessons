package mate.academy.less03;

public class Sort2 {
    public static void main(String[] args) {

        int[] a1 = new int[] {40, 42, 44, 46, 100, 101, 102, 900, 2100};
        int[] a2 = new int[] {10, 11, 12, 50, 65, 86};

        int[] rasult = mergeArrays(a1,a2);

        for (int a : rasult) {
            System.out.print(a + " ");
        }
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];

        int lenght_a1 = a1.length;
        int lenght_a2 = a2.length;

        if (lenght_a1 > 0 && lenght_a2 > 0) {
//            if (a1[0])>
        }


        return a3;
    }
}
