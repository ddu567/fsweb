package exam;

import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int car = 170;
        int[] tn = new int[3];
        System.out.print("터널 a의 높이를 입력하세요> ");
        tn[0] = scan.nextInt();
        System.out.print("터널 b의 높이를 입력하세요> ");
        tn[1] = scan.nextInt();
        System.out.print("터널 c의 높이를 입력하세요> ");
        tn[2] = scan.nextInt();

        for (int i = 0; i < tn.length; i++) {
            if (tn[i] > car) {
                System.out.println("PASS");
            } else if (tn[i] <= car) {
                System.out.println("CRASH " + tn[i]);
            }
        }

        scan.close();
    }
}
