package exam;

import java.util.Scanner;

public class Ex40_a {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("슬기가 던진 공의 위치>");
    float ball = scan.nextFloat();

    if (ball <= 60 && ball >= 50) {
      System.out.println("Win");
    } else {
      System.out.println("Lose");

    }

    scan.close();
  }
}
