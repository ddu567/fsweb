package exam;

import java.util.Scanner;

public class Ex38 {
  public static void main(String[] args) {
    // 삼각형의 넓이를 구하는 프로그램을 작성한다.
    /* 
    삼각형의 넓이 = 밑변 * 높이 / 2
    밑변(a)과 높이(b)가 정수로 입력된다.
    삼각형의 넓이를 소수 첫째자리까지 출력한다.
     */

    Scanner scan = new Scanner(System.in);

    System.out.print("삼각형의 밑변을 입력하세요> ");
    int a = scan.nextInt();
    System.out.print("삼각형의 높이를 입력하세요> ");
    int b = scan.nextInt();

    // 소수점 한 자리 출력 -> %.1f , (float)
    System.out.printf("%.1f", (float)(a * b / 2));
    scan.close();
  }
}
