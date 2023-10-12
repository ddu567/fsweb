package exam;

import java.util.Scanner;

public class Ex64 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("정수를 입력하세요> ");
    int a = scan.nextInt();
    System.out.print("정수를 입력하세요> ");
    int b = scan.nextInt();

    System.out.println(a % b);
    scan.close();
  }
}
