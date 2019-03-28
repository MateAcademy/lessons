package mate.academy.hw01;

public class FootbalMatch {
    public static void main(String[] args) {
        FootbalMatch footbalMatch = new FootbalMatch();

        System.out.println(footbalMatch.footballGame(0, 2, 1, 1));  //0
        System.out.println(footbalMatch.footballGame(2, 1, 2, 1));  //2
        System.out.println(footbalMatch.footballGame(3, 1, 2, 0));  //1
        System.out.println(footbalMatch.footballGame(3, 1, 1, 2));  //0
        System.out.println(footbalMatch.footballGame(1, 2, 1, 2));  //2
        System.out.println(footbalMatch.footballGame(0, 0, 0, 0));  //2
        System.out.println(footbalMatch.footballGame(1, 2, 0, 1));  //1
        System.out.println(footbalMatch.footballGame(1, 2, 0, 0));  //0
        System.out.println(footbalMatch.footballGame(2, 2, 0, 0));  //1
    }

    private Integer footballGame(Integer scoreA, Integer scoreB, Integer betA, Integer betB) {
        boolean compare1 = (scoreA == betA) && (scoreB == betB);
        boolean compare2 = (scoreA < scoreB) == (betA < betB);

        return compare1 ? 2 : compare2 ? 1 : 0;
    }

}
