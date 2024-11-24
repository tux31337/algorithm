package basicalgorithm.chap03;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9 , 10, 11, 12};

        int result = Arrays.binarySearch(arr, 13);
        System.out.println(result);
    }
}
