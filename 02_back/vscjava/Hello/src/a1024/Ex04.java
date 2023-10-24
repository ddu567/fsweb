package a1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 문자열 리스트에서 모든 문자열을 대문자로 변환한 후 심표로 구분된 하나의 문자열을 얻는 Java 스트림 코드를 작성하십시오.

public class Ex04 {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry");
    String result = words.stream()
      .map(String::toUpperCase)
      .collect(Collectors.joining(", "));

      System.out.println(result);
  }
}
