package exam;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("BMI를 입력해주세요>");
        int bmi = scan.nextInt();

        if (bmi > 23) {
            System.out.println("비만");
        } else if (bmi > 18) {
            System.out.println("정상체중");
        } else {
            System.out.println("저체중");
        }

        scan.close();
    }
}
