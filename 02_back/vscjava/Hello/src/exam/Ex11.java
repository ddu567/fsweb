package exam;
// 문자 입출력

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    // 정수 두 개를 차례로 입력받아 그대로 출력한다.

      // 입력 
      // 두 개의 정수가 차례대로 입력된다.
      // 출력
      // 입력받은 두 정수를 공백으로 구분하여 그대로 출력
      


    Scanner scan = new Scanner(System.in);
    
    System.out.print("첫 번째 문자를 입력> ");
    String str1 = scan.next();
        System.out.print("두 번째 문자를 입력> ");
    String str2 = scan.next();
    
    // scan.nextln() -> 공백 불포함. 공백 전까지 출력

    System.out.print(str2 + " " + str1);
    scan.close();
  }
}
