package a1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//  주어진 숫자 리스트의 제고값을 계산하는 Java 스트림 코드를 작성하십시오.
public class Ex03 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> squaredNumbers = numbers.stream()
      .map(n -> n*n)
      .collect(Collectors.toList());

    System.out.println(squaredNumbers);
  }
}
