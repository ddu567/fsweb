package exam;

import java.util.Scanner;

public class Ex66 {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("정수를 입력하세요> ");
      int num = scan.nextInt();
      int sum = 0;
      int i = 0;

      for (i = 1; i <= num; i++) {
        sum = sum + i;

        if (num <= sum) {
          break;
        }
      }
    }


    // while (true) {
    // sum = sum + i;
    // if (sum >= num) {
    // break;
    // }
    // System.out.println(i + "+");
    // i++;
    // }

    // System.out.println(sum + "입력한 수보다 크거나 같으므로 종료합니다.");



  }
}
