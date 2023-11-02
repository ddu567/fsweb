package exam;
//아스키코드 10진수

import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {
    // 영문자 한 개를 이력받아 아스키코드 10진수 값으로 출력하는 프로그램을 작성해보자.
    
    Scanner scan = new Scanner(System.in);
    String  str = scan.nextLine();
    char c = str.charAt(0); // 인덱스 0(첫 번째) 문자를 가져옴.
    int num = c;
    System.out.println(num);
    

    scan.close();
  }
}
