package exam;

import java.util.Scanner;

public class Ex65 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("숫자를 입력하세요> ");
    int a = scan.nextInt();
    if (a >= 1 && a <= 10) {
      for (int i = 1; i <= a; i++) {
        if (a%3 == 0) {

        }
        System.out.print(i + " ");
      }

    }
    scan.close();
  }
}
