package a1018.list;

import java.util.ArrayList;

public class Q2 {
  // 문제 2: ArrayList 요소 합계 계산
  // ArrayList에 정수 요소를 추가하고, 이 요소들의 합계를 계산하여 출력하세요.

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
      list.add(i);
    }
    int sum = 0;
    for (int num : list) {
      sum += num;
    }
    System.out.println("합계: " + sum);
  }
}
