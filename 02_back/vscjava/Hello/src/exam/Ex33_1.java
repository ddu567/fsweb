package exam;

import java.util.Scanner;

public class Ex33_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("입력");
    int month = scanner.nextInt();

    if (month >= 1 && month <= 12) {
      if (month >= 3 && month <= 5) {
        System.out.println("봄");
      } else if (month >= 6 && month <= 8) {
        System.out.println("여름");
      } else if (month >= 9 && month <= 11) {
        System.out.println("가을");
      } else {
        System.out.println("겨울");
      }
    }
    scanner.close();
  }
}
