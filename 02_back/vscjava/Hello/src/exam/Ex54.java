package exam;

import java.util.Scanner;

public class Ex54 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("a 값을 입력하세요> ");
    int a = scan.nextInt();
    System.out.print("b 값을 입력하세요> ");
    int b = scan.nextInt();
    if (a > 0 && b > 0) {
      if (b % a == 0) {
        int x = b / a;
        System.out.println(a + "*" + x + "=" + b);
      } else if (a % b == 0) {
        int x = a / b;
        System.out.println(b + "*" + x + "=" + a);
      } else {
        System.out.println("none");
      }
    }
    scan.close();
  }
}
