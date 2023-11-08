package exam;

import java.util.Scanner;

public class Ex35 {
  public static void main(String[] args) {
    // 정수 한 개를 입력받아 1 부터 그 수까지 짝수의 합을 구해보자.

    Scanner scanner = new Scanner(System.in);

    System.out.print("숫자를 입력해주세요>");

    // 변수 선언
    int num = scanner.nextInt();
    int sum = 0;

    for(int i = 0; i<=num; i++) {
      if(i%2 == 0) {
        sum += i; 
      }
    }

    System.out.println(sum);
    scanner.close();
  }
}
