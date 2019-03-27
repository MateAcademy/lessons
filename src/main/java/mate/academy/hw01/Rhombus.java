package mate.academy.hw01;

public class Rhombus {
    public static void main(String[] args) {
        System.out.println("Size of Rhombus = 3");
        rhombusDisplay(3);
    }

    private static void rhombusDisplay(int point) {

        float center = point / 2;

        for (int i = 0; i < point; i++) {
            System.out.println();
            for (int j = 0; j < point; j++) {
                if (i <= center) {
                    if (j >= center - i && j <= center + i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else {
                    if (j >= center + i - point + 1 && j <= center - i + point - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
        }
    }

}
