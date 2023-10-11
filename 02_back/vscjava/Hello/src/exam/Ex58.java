package exam;

import java.util.Scanner;

public class Ex58 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("직선 세 개의 길이를 입력하세요");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    int max = a;
    int num1 = 0;
    int num2 = 0;

    if (max < b) {
      max = b;
      num1 = a;
      num2 = c;
    } else if (max < c) {
      max = c;
      num1 = a;
      num2 = b;
    } else {
      num1 = b;
      num2 = c;
    }

    int sum = num1 + num2;
    if(max < sum){
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    scan.close();
  }
}
