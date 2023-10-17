package exam;

import java.util.Scanner;

public class Ex70 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("시작 값을 입력하세요> ");
    int a = scan.nextInt();
    System.out.print("등비 값을 입력하세요> ");
    int r = scan.nextInt();
    System.out.print("몇 번째 수인지 입력하세요> ");
    int n = scan.nextInt();

    int num = 0;
    for (int i = 1; i <= n; i++) {
      num = a * (int) Math.pow(r, n - 1);
    }
    System.out.println(num);

    scan.close();
  }

}
