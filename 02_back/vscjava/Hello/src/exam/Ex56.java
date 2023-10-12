package exam;

import java.util.Scanner;

public class Ex56 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] game = new int[4];
    System.out.println("윷의 각각 생태를 입력해주세요.");
    for(int i = 0; i<game.length;i++){
      game[i] = scan.nextInt();
    }

    // 배열 출력
    // System.out.println(Arrays.toString(game));

    int frequency = 0;

    for (int i = 0; i < game.length; i++) {
      int targetValue = game[i];
      if (targetValue == 1) {
        frequency++;
      }
    }
    // System.out.println(frequency);
    
    if (frequency == 1) {
      System.out.println("도");
    } else if (frequency == 2) {
      System.out.println("개");
    } else if (frequency == 3) {
      System.out.println("걸");
    } else if (frequency == 4) {
      System.out.println("윷");
    } else {
      System.out.println("모");
    }

    scan.close();
  }
}