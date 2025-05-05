package pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1931 {
    static class Meeting {
        int start, end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        // 회의 시작 시간 회의 끝나는 시간
        // 회의 시작 시간 == 회의 끝나는 시간 가능
        Scanner scanner = new Scanner(System.in);

        // 첫째 줄 회의의 수
        int N = scanner.nextInt();

        List<Meeting> meetings = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            meetings.add(new Meeting(start, end));
        }

        meetings.sort((a, b) -> {
            if (a.end == b.end) return a.start - b.start;
            return a.end - b.end;
        });

        int count = 0;
        int lastEnd = 0;

        for (Meeting meeting : meetings) {
            if (meeting.start >= lastEnd) {
                count++;
                lastEnd = meeting.end;
            }
        }

        System.out.println("count = " + count);
    }



}
