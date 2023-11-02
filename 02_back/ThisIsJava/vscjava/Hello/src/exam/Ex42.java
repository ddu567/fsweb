package exam;

import java.util.Scanner;

public class Ex42 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("위치를 입력하세요>");
    int num = scan.nextInt();

    if (num >= 50 && num <= 70) {
      System.out.println("win");
    } else if (num % 6 == 0) {
      System.out.println("win");
    } else {
      System.out.println("lose");
    }

    scan.close();
  }
}
