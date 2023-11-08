package exam;

import java.util.Scanner;

public class Ex63 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("일(day)을 입력하세요> ");
    int day = scan.nextInt();

    System.out.println(day * 24);

    scan.close();
  }
}
