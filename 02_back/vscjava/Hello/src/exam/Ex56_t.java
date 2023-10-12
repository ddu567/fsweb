package exam;

import java.util.Scanner;

public class Ex56_t {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] yutState = new int[4];

    // 4가지 윷의 상태 입력
    for (int i = 0; i < 4; i++) {
      yutState[i] = scan.nextInt();
    }

    int flippedCount = 0;
    for (int state : yutState) {
      if (state == 1) {
        flippedCount++;
      }
    }

    // 결과 출력
    switch(flippedCount) {
      case 0:
      System.out.println("모");
      break;
      case 1:
      System.out.println("도");
      break;
      case 2:
      System.out.println("개");
      break;
      case 3:
      System.out.println("걸");
      break;
      case 4:
      System.out.println("윷");
      break;

      default:
      System.out.println("잘못된 입력");

    }
    scan.close();
  }
}
