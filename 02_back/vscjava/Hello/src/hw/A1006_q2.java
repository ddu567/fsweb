package hw;

public class A1006_q2 {
  public static void main(String[] args) {
    // 문제 2: 배열 요소의 합과 평균 구하기
    // 주어진 실수 배열의 요소들의 합과 평균을 계산하는 프로그램을 작성하세요.
    double[] values = { 1.5, 2.5, 3.0, 4.5, 5.0 };

    // 배열 요소의 합
    double sum = 0;
    for (int i=0; i<values.length; i++){
      sum += values[i];
    }
    System.out.println("배열 요소의 합: " + sum);

    // 배열 요소의 평균
    double avg = sum / values.length;
    System.out.println("배열 요소의 평균: " + avg);
  }
}
