package exam;

import java.util.Scanner;

public class Ex45 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("정수 a, b, c가 차례로 입력됩니다.");

    // 변수 선언
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    
    double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;

    for (a = -10; a >= -10 && a != 0 && a <= 10; a++) {
      for (b = -10; b >= -10 && b <= 10; b++) {
        for (c = -10; c >= -10 && c <= 10; c++) {
          // result1 = a*x1*x1+b*x1+c=0;
        }
      }
    }

    // https://www.walterz.net/2023/03/16/quadratic-equation-python-c-java/

    scan.close();
  }
}
