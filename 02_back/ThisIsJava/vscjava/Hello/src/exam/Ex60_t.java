package exam;

import java.util.Scanner;

public class Ex60_t {

  public static void main(String[] args) {
    int car = 170;
    int[] tunnel = new int[3];
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      System.out.print("터널의 높이 입력>");
      tunnel[i] = scan.nextInt();

      if (tunnel[i] < car) {
        System.out.println("PASS");
      } else {
        System.out.println("CRASH");
        break;
      }
    }

    scan.close();

  }
}
