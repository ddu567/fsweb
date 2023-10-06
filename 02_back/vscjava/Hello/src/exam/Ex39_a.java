package exam;

import java.util.Scanner;

public class Ex39_a {
  public static void main(String[] args) {
    // 세 정수가 주어지면 그 중 가장 작은 수를 출력한다.

    Scanner scan = new Scanner(System.in);
    int[] num = new int[3];
    for (int i = 0; i < 3; i++) {
      System.out.println("숫자를 입력하세요>");
      num[i] = scan.nextInt();
    }

    int min = num[0];
    for (int i = 0; i < num.length; i++) {
      if (min > num[i]) {
        min = num[i];
      }
    }
    // for 문을 빠져나오지 않으면 입력한 모든 값이 출력된다.
    System.out.println("최솟값은? " + min);

    scan.close();
  }
}
