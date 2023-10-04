package a1004;

import java.util.Scanner;

public class A1004_hw34 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("입력");

    
    while (true) {
      int i = scanner.nextInt();
      if (i != 0) {
        System.out.println(i);
        continue;
      } else {
        break;
      }
    }
    scanner.close();

  }
}
