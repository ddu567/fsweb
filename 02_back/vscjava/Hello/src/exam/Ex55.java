package exam;

import java.util.Scanner;

public class Ex55 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("점수를 입력하세요> ");
    int score = scan.nextInt();
    if (score >= 0 && score <= 100) {
      if (score >= 90) {
        System.out.println("A");
      } else if (score >= 80) {
        System.out.println("B");
      } else if (score >= 70) {
        System.out.println("C");
      } else if (score >= 60) {
        System.out.println("D");
      } else {
        System.out.println("F");
      }
    }
    scan.close();
  }
}
