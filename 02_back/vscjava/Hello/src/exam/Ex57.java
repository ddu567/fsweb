package exam;

import java.util.Scanner;

public class Ex57 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Ria ria = new Ria();

    for (int i = 0; i < ria.menu.length; i++) {
      System.out.println((i + 1) + ". " + ria.menu[i] + ": " + ria.cal[i] + " 칼로리");
    }

    System.out.println("메뉴 2가지를 선택해주세요.");
    int pic1 = scan.nextInt();
    int pic2 = scan.nextInt();

    int sum = ria.cal[pic1 - 1] + ria.cal[pic2 - 1];
    // System.out.println(sum);

    if (sum > 500) {
      System.out.println("angry");
    } else {
      System.out.println("no angry");
    }

    scan.close();
  }
}

class Ria {
  String[] menu = { "치즈버거", "야채버거", "우유", "계란말이", "샐러드" };
  int[] cal = { 400, 340, 170, 100, 70 };
}