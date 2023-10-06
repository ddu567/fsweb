package hw;

public class A1004_q6 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print('*'); // println: 줄바꿈
        if (j == i) {
          System.out.println();
        }
      }
    }
  }
}
