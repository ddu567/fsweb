package a1004;
// for 문

public class A1004_5 {
  public static void main(String[] args) {
    // sum 은 누적되는 수를 담는 변수
    int sum = 0;
    // i는 숫자가 증가되는변수  
    int i = 0;

    for(i = 1; i <= 100; i++) {
      sum += i; // sum = sum + 1
    }
    // 방법1
    // System.out.println("1~100 합: " + sum);

    // 방법2
    // System.out.println("1~" + (i-1) + "100 합: " + sum);  // i가 101이면 for문을 빠져나옴
    System.out.printf("1~%d 합: %d\n", (i - 1), + sum);
  }
}
