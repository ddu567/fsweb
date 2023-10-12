package exam;

import java.util.Scanner;

public class Ex58_t {
  public static void main(String[] args) {
    System.out.println("삼각형이 만들어 질수 있는 길이를 입력하시오");
    Scanner scanner = new Scanner(System.in);
    System.out.println(" a의 값을 입력해 주세요");
    int a = scanner.nextInt();
    System.out.println(" b의 값을 입력해 주세요");
    int b = scanner.nextInt();
    System.out.println(" c의 값을 입력해 주세요");
    int c = scanner.nextInt();

    int[] arr = new int[3];
    arr[0] = a;
    arr[1] = b;
    arr[2] = c;

    int maxLength = 0;
    for (int i = 0; i < arr.length; i++) {
      if (maxLength < arr[i]) {
        maxLength = arr[i];
      }
    }

    if (maxLength == arr[0]) {
      if (a < b + c) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    } else if (maxLength == arr[1]) {
      if (b < a + c) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    } else if (maxLength == arr[2]) {
      if (c < a + b) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
    scanner.close();
  }

}
