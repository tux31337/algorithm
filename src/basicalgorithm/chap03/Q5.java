package basicalgorithm.chap03;

public class Q5 {
    static int binarySearch(int[] arr, int target) {
        int pl = 0;
        int pr = arr.length - 1;
        int resultIndex = -1;
        while (pl <= pr) {
            int pc = (pl + pr) / 2;

            if (arr[pc] == target) {
                for (int i = pc; i >= pl; i--) {
                    if (arr[pc - 1] < target) {
                        break;
                    }
                    resultIndex = i;
                }
                return resultIndex;

            } else if (arr[pc] < target) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        }

        return resultIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 5, 6, 7};
        int test = binarySearch(arr, 1);
        System.out.println(test);
    }
}
