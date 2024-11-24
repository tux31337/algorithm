package basicalgorithm.chap02.pratice;

public class Q3 {
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length / 2; i++) {
            sum+=a[i];
            sum+=a[a.length - i - 1];
        }

        return a.length % 2 == 0 ? sum : sum+a[a.length / 2];
    }
    public static void main(String[] args) {
        int [] a = {1, 3, 5, 6};
        System.out.println(sumOf(a));
    }
}
