package hw;

import java.util.Arrays;

public class A1006_q4 {
  public static void main(String[] args) {
    // 문제 4: 중복 요소 제거하기
    // 정수 배열에서 중복된 요소를 제거하고 중복이 제거된 배열을 반환하는 프로그램을 작성하세요.
    int[] numbers = { 1, 2, 2, 3, 4, 4, 5 };


    int[] resultNum = Arrays.stream(numbers).distinct().toArray();

    // resultNum 을 출력하면 값이 아닌 주소가 출력됨
    System.out.println(Arrays.toString(resultNum));





}

}
