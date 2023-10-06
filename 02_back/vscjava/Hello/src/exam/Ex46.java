package exam;

import java.util.Scanner;

public class Ex46 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("터널의 높이가 차례대로 입력됩니다>");
    int[] tn = new int[3];
    for(int i = 0; i<3; i++){
      tn[i] = scan.nextInt();
      if(tn[i] <= 170) {
        System.out.println("CRASH");
      } else {
        System.out.println("PASS");
      }
    }

    scan.close();
  }
}
