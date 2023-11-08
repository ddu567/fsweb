package exam;

import java.util.Scanner;

public class Ex20 {
  public static void main(String[] args) {
    // 입력 받은 정수 세 개의 합과 평균을 줄을 바꿔 출력한다.
    // 평균은 소수점 이하 둘째 자리에서 반올림하여 첫째 자리까지 출력한다.

    Scanner scan = new Scanner(System.in);

    System.out.print("숫자1 입력> ");
    int num1 = scan.nextInt();
    System.out.print("숫자2 입력> ");
    int num2 = scan.nextInt();
    System.out.print("숫자3 입력> ");
    int num3 = scan.nextInt();

    int sum = num1 + num2 + num3;
    System.out.println("총 합: " + sum);

    // 소숫값을 위해 int -> float
    // 반올림 -> + 0.05f
    // 소수점 한 자리 표시를 위한 정수처리 -> * 10
    float i = ((float) sum / 3 + 0.05f) * 10;
    // 나머지 소수 부분 삭제 (소수 첫째 자리는 *10을 하여 정수 부분에 있음) float -> int
    int j = (int) i;
    // 소수 표시를 위해 int -> float, /10
    float avg = (float) j/10;

    System.out.println(avg);
    scan.close();
  }
}
