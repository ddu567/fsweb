package a1005;
// 배열 요소의 평균

public class A1005_q3 {
  public static void main(String[] args) {
    double[] array = {2.5, 3.0, 1.5, 4.0, 2.0,};

    // 소수라 배열을 double로 선언
    double sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    System.out.println("배열 요소의 평균: " + sum / array.length);
  }
}
