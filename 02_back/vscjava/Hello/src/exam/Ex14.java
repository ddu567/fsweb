package exam;
// 시, 분 (직접)입출력

import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    // 시간이 특정 형식에 맞추어 입력될 때 그대로 출력하는 프로그램을 작성 해보자.

    Scanner scan = new Scanner(System.in);

    System.out.print("시 입력>");
    int hour = scan.nextInt();
    System.out.print("분 입력>");
    int minute = scan.nextInt();

    System.out.println(hour +":" + minute);

    scan.close();
  }
}
