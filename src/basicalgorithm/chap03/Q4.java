package basicalgorithm.chap03;

public class Q4 {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;              // 검색 범위의 시작 인덱스
        int right = arr.length - 1; // 검색 범위의 끝 인덱스

        System.out.print("   | ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.print("---+");

        for (int i = 0; i < 4 * arr.length + 2; i++) {
            System.out.print("-");
        }

        System.out.println();

        while (left <= right) {
            int mid = left + (right - left) / 2; // 중간 인덱스 계산 (오버플로 방지)

            System.out.print("   |");
            for (int i = 0; i < arr.length; i++) {
                if(i == left) {
                    System.out.printf("%" + 4 + "s", "<-");
                } else if(i == mid) {
                    System.out.printf("%" + 4 + "s", "+");
                } else if (i == right) {
                    System.out.printf("%" + 4 + "s", "->");
                } else {
                    System.out.printf("%" + 4 + "s", " ");
                }
            }
            System.out.println();

            System.out.print("   | ");
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%4d", i);
            }
            System.out.println();

            if (arr[mid] == target) {
                return mid; // 타겟을 찾았을 때 해당 인덱스 반환
            } else if (arr[mid] < target) {
                left = mid + 1; // 타겟이 중간값보다 크면 오른쪽 검색
            } else {
                right = mid - 1; // 타겟이 중간값보다 작으면 왼쪽 검색
            }
        }

        return -1; // 타겟이 배열에 없을 경우 -1 반환
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int test = binarySearch(arr, 2);
        System.out.println(test);
    }
}
