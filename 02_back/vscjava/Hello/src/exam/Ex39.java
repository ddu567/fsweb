package exam;

import java.util.Scanner;

public class Ex39 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] num = new int[3];
    for(int i = 0; i<num.length; i++) {
      System.out.print("정수를 입력하세요> ");
      num[i] = scan.nextInt();
    }

    int min = num[0];
    for(int i = 0; i<num.length; i++){
      if (min > num[i]){
        min = num[i];
      }
    }
    // for 문을 빠져나오지 않으면 입력한 모든 값이 출력된다.
    System.out.println("최솟값: " + min);

    
    scan.close();
  }
}
