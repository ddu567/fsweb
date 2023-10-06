package exam;
// 10진수, 8진수 / printf

import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // 10진수 8진수 바꾸기
    int num = scan.nextInt();
    // printf -> 형식에 맞춰서 출력
    System.out.printf("%o", num);
    System.out.printf("%x", num);
    // %o -> 8진수
    // %x -> 16진수 

    scan.close();
  }
}
