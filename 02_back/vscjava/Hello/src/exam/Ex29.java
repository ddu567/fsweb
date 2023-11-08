package exam;

import java.util.Scanner;

public class Ex29 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // 세 정수 a, b, c가 입력되었을 때 짝수(even) 홀수(odd) 출력

    System.out.print("정수를 입력하세요>");
    int a = scan.nextInt();
    System.out.print("정수를 입력하세요>");
    int b = scan.nextInt();
    System.out.print("정수를 입력하세요>");
    int c = scan.nextInt();
    if (a % 2 == 0) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
    if (b % 2 == 0) {
      System.out.println(a);
    } else {
      System.out.println("홀수");
    }
    if (c% 2 == 0) {
    } else {
      System.out.println("홀수");
    }
    scan.close();
  }
}
