package exam;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("시를 입력해주세요>");
        int hour = scan.nextInt();
        System.out.println("분을 입력해주세요>");
        int minute = scan.nextInt();

        if (minute < 30) {
            System.out.print(hour-1 + " ");
            System.out.print(30+minute);
        } else {
            System.out.print(hour + " ");
            System.out.print(minute-30);

        }

        scan.close();
    }
}
