package exam;

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("연도를 입력하세요: ");
        int year = scan.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("yes");
        } else if (year % 400 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scan.close();
    }
}