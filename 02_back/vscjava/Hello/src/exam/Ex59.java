package exam;

import java.util.Scanner;

public class Ex59 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int[] lotto = { 0, 0, 0, 0, 0, 0, 0 };
    int[] have = { 0, 0, 0, 0, 0, 0, 0 };

    System.out.println("로또 당첨번호를 입력하세요");
    for (int i = 0; i <= 7; i++) {
      lotto[i] = scan.nextInt();
    }
    System.out.println("가지고 있는 번호를 입력하세요");
    for (int i = 0; i < 7; i++) {
      have[i] = scan.nextInt();
    }

    int count = 0;

    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 6; j++)
        if (have[i] == lotto[j]) {
          count++;
        }
    }

    if (count == 6 ){
      System.out.println("1등");
    } else if (count == 5 && lotto[6] == have[6]){
      System.out.print("보너스 번호를 입력하세요> ");
      System.out.println("2등");
    } else if (count == 5 && lotto[6] != have[6]){
      System.out.println("3등");
    } else if (count == 4){
      System.out.println("4등");
    } else if (count == 3){
      System.out.println("5등");
    } else {
      System.out.println("꽝");
    }

    scan.close();
  }
}
