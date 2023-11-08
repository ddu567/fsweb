package a1018.list;

import java.util.ArrayList;

public class Q1 {
  // 문제 1: ArrayList에 요소 추가
  // ArrayList에 정수 요소 1부터 5까지를 추가하고 그 결과를 출력하세요.

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i<=5; i++) {
      list.add(i);
    }
    System.out.println(list);
  }

}
