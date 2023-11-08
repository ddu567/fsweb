package exam;

import java.util.Scanner;

public class Ex41 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("위치를 입력하세요>");
    int num = scan.nextInt();

    if (num >= 30 && num <= 40 && num >= 60 && num <= 70) {
      System.out.println("win");
    } else {
      System.out.println("lose");
    }

    scan.close();
  }
}
