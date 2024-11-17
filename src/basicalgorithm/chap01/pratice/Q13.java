package basicalgorithm.chap01.pratice;

public class Q13 {
    public static void main(String[] args) {
        int num = 9;

        System.out.print("  | ");
        for (int i = 1; i <= num; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n--+-------------------------");

        for (int i = 1; i <= num; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= num; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }
}
