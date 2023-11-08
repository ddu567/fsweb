package exam;

import java.util.Scanner;

public class Ex44 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] week = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

    // 요일 순서 출력
    for (int i = 0; i < week.length; i++) {
      System.out.println((i + 1) + ". " + week[i]);
    }

    System.out.print("요일 번호를 입력하세요>");
    int num = scan.nextInt() - 1;

    /*
     * if (num == 0 && num == 2 && num == 4) {
     * System.out.println("oh my god");
     * } else {
     * System.out.println("enjoy");
     * }
     */

    if (num == 0) {
      System.out.println("oh my god");
    } else if (num == 2) {
      System.out.println("oh my god");
    } else if (num == 4) {
      System.out.println("oh my god");
    } else {
      System.out.println("enjoy");
    }

    scan.close();
  }
}
