package a1004;

import java.util.Scanner;

public class A1004_hw32 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("입력");

    char chAl = scanner.next().charAt(0);

    switch (chAl) {
      case 'A':
        System.out.println("best!!");
        break;
      case 'B':
        System.out.println("good!!");
        break;
      case 'C':
        System.out.println("run!");
        break;
      default:
        System.out.println("what?");
        break;
    }

    scanner.close();
  }
}
