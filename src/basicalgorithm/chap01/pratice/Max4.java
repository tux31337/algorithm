package basicalgorithm.chap01.pratice;

public class Max4 {
    static int calculateMax4(int a, int b, int c, int d) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        if (d > max) {
            max = d;
        }

        return max;
    }

    public static void main(String[] args) {
        int max = calculateMax4(5, 10, 20, 3);
        System.out.println("max = " + max);
    }
}
