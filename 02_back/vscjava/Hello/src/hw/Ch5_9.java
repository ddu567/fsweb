package hw;

import java.util.Scanner;

public class Ch5_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean run = true;

        int student = 0;
        int[] scores = null;

        while (run) {
            System.out.println("---------------------------------------------------------");
            System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
            System.out.println("---------------------------------------------------------");
            System.out.print("선택> ");
            int num = Integer.parseInt(scan.nextLine());
            // scan.nextInt()는 한 번 숫자를 입력하면 끝
            // scan.nextLine()은 입력하면 그 값이 저장되어 다른 항목 선택 가능

            if (num == 1) {
                System.out.print("학생수>");
                student = Integer.parseInt(scan.nextLine());
                scores = new int[student];
            } else if (num == 2) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "]> ");
                    scores[i] = Integer.parseInt(scan.nextLine());
                }
            } else if (num == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "] : " + scores[i]);
                }
            } else if (num == 4) {
                int max = 0;
                int sum = 0;
                double avg = 0;
                for (int i = 0; i < scores.length; i++) {
                    max = (max < scores[i]) ? scores[i] : max;
                    sum += scores[i];
                }
                avg = (double) sum / student;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            } else {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
        scan.close();
    }
}
