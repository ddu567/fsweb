package exam;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    // 키보드로 입력한 정수값을 그대로 출력하는 프로그램을 작성해보자.
    // Scanner scan = new Scanner(System.in);
    // 상단 import.java.util.Scanner;
    // 상단에 import가 안 나올 때는 Alt + Shift + O
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    System.out.println(num);
    scan.close();
  }
}
