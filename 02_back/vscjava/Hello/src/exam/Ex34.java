package exam;

import java.util.Scanner;

public class Ex34 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    
    while (true) {
      System.out.println("숫자를 입력해주세요>");
      int i = scanner.nextInt();
      if (i != 0) {
        System.out.println(i);
        continue;
      } else {
        System.out.println(i + "종료");
        break;
      }
    }
    scanner.close();

  }
}
