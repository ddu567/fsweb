package exam;

import java.util.Scanner;

public class Ex27 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("정수를 입력하세요>");
    int a = scan.nextInt();
    System.out.print("정수를 입력하세요>");
    int b = scan.nextInt();
    // 삼항 연산자 조건 ? 참 : 거짓
    // int i = (a>b) ? a : b;
    // System.out.println(i);

    int i;
    if(a > b){
      i = a;
    } else {
      i = b;
    }
    System.out.println(i);
    scan.close();
  }
}
