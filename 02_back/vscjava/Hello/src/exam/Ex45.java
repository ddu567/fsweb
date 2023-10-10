package exam;

import java.util.Scanner;

public class Ex45 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // 변수 선언
    System.out.print("a 값을 입력하세요> ");
    int a = scan.nextInt();
    if (a >= -10 && a <= 10 && a != 0) {
      System.out.print("b 값을 입력하세요> ");
      int b = scan.nextInt();
      if (b >= -10 && b <= 10) {
        System.out.print("c 값을 입력하세요> ");
        int c = scan.nextInt();
        if (c >= -10 && c <= 10) {

          // Math.sqrt() 제곱근 함수 ,double
          // Math.pow(a,b) = a^b, double
          // 판별식 D
          double D = Math.pow(b, 2) - (4 * a * c);

          double x1 = (-b + Math.sqrt(D)) / 2 * a;
          double x2 = (-b - Math.sqrt(D)) / 2 * a;

          if (D < 0) {
            System.out.println("실근이 없습니다.");
          } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("방정식의 해는 " + x);
          } else if (D > 0) {
            // 소수점 아래 두 자리 출력: printf("%.2f, x")
            System.out.printf("방정식의 해는 " + "%.2f\n", x1);
            System.out.printf("방정식의 해는 " + "%.2f\n", x2);
          }
        }
      }
    }

    scan.close();
  }
}
