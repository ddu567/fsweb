package exam;

import java.util.Scanner;

public class Ex36 {
  public static void main(String[] args) {
    // 1부터 n까지, 1부터 m 까지 숫자가 적힌 색이 서로 다른 주사위 2개를 던졌을 때, 나올 수 있는 모든 경우를 출력해보자.

    Scanner scanner = new Scanner(System.in);

    System.out.println("입력");

    int n = scanner.nextInt();
    int m = scanner.nextInt();

    for (n = 1; n <= 10; n++) {
      for (m = 1; m <= 10; m++) {
        System.out.println("(" + n + ", " + m + ")");
      }
    }

    scanner.close();
  }
}
