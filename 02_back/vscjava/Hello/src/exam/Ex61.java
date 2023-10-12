package exam;

import java.util.Scanner;

public class Ex61 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("숫자를 입력하세요> ");
    int a = scan.nextInt();
    System.out.print("연산기호를 입력하세요> ");
    String str = scan.next();
    System.out.print("숫자를 입력하세요> ");
    int b = scan.nextInt();

    if (str == "+") {
      System.out.println(a + b);
    } else if (str == "-") {
      System.out.println(a - b);
    } else if (str == "*") {
      System.out.println(a * b);
    } else {
      System.out.printf("%.2f", (double) (a / b));
    }

    scan.close();
  }
}