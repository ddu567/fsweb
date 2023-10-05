package a1004;

import java.util.Scanner;

public class A1004_hw36 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("입력");

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    
    for(n = 1 ; n <= 10; n++){
      for(m = 1; m <=10; m++){
        System.out.println("(" + n + ", " + m + ")");
      }
    }



    scanner.close();
  }
}
