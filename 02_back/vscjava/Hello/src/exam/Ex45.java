package exam;

import java.util.Scanner;

public class Ex45 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // 변수 선언
    System.out.println("a 값을 입력하세요> ");
    int a = scan.nextInt();
    System.out.println("b 값을 입력하세요> ");
    int b = scan.nextInt();
    System.out.println("c 값을 입력하세요> ");
    int c = scan.nextInt();

    
    double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;

    for (a = -10; a >= -10 && a != 0 && a <= 10; a++) {
      for (b = -10; b >= -10 && b <= 10; b++) {
        for (c = -10; c >= -10 && c <= 10; c++) {
          // int result1 = a*x1*x1+b*x1+c=0;
        }
      }
    }

    // https://www.walterz.net/2023/03/16/quadratic-equation-python-c-java/

    scan.close();
  }
}
