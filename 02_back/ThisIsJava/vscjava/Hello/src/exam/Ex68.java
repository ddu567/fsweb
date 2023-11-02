package exam;

import java.util.Scanner;

public class Ex68 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("정수를 입력하세요> ");
    int n = scan.nextInt();

    for (int i = 0; i <= n; i++) {
      System.out.println(i);
    }

    scan.close();
  }
}
