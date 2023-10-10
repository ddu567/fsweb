package exam;

import java.util.Scanner;

public class Ex53 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("a 값을 입력하세요> ");
    int a = scan.nextInt();
    System.out.print("b 값을 입력하세요> ");
    int b = scan.nextInt();

    int[] math = { a + b, a - b, a * b, a / b };
    int max = math[0];
    for (int i = 1; i < math.length; i++) {
      if (max < math[i]) {
        max = math[i];
      }
    }
    // java에서는 %lf 사용 불가 (c/c++ 가능)
    System.out.printf("최댓값: " + "%f", (double) max);

    scan.close();

  }
}