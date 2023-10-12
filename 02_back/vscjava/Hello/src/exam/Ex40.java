package exam;

import java.util.Scanner;

public class Ex40 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("위치를 입력해주세요> ");
    float height = scan.nextFloat();

    if (height >= 50 && height <= 60) {
      System.out.println("win");
    } else {
      System.out.println("lose");
    }

    scan.close();
  }
}
