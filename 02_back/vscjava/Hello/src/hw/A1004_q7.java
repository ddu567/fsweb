package hw;

import java.util.Scanner;

public class A1004_q7 {
  public static void main(String[] args) {

    boolean money = true;
    int balance = 0;
    Scanner scanner = new Scanner(System.in);

    while (money) {
      System.out.println("---------------------------------------");
      System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
      System.out.println("---------------------------------------");
      System.out.println("선택: ");

      int menuNum = Integer.parseInt(scanner.nextLine());

      switch (menuNum) {
        case 1:
          System.out.print("예금액>");
          balance += Integer.parseInt(scanner.nextLine());
          break;
        case 2:
          System.out.print("출금액>");
          balance -= Integer.parseInt(scanner.nextLine());
          break;
        case 3:
          System.out.print("잔고>");
          System.out.println(balance);
          break;
        case 4:
          money = false;
      }

      System.out.println();
      
      scanner.close();
    }
    System.out.println("프로그램 종료");
  }
}
