package exam;
// float, 소수점 자리 반올림 하기

import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    // 실수(float) 한 개를 입력받아 소수점 이하 3째 자리에서 반올림 하여 2째 자리까지 출력하시오.
    // 예시) 1.59254 -> 1.59

    Scanner scan = new Scanner(System.in);
    float num = scan.nextFloat();
    num = (num + 0.005f)*100;
    // System.out.printf("%.2f",num);
    System.out.println(num);
    // 소수를 정수(작은 수)로 표현, -> (int)
    int i = (int)num;
    System.out.println(i);
    num = (float) i/100;
    System.out.println(num);
    
    


    scan.close();
  }
}
