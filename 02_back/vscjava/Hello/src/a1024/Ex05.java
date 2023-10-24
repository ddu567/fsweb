package a1024;

import java.util.Arrays;
import java.util.List;

// 주어진 문자열 리스트에서 문자 'a'를 포함하는 문자열의 수릴 계산하는 java 스트림 코드를 작성하십시오

public class Ex05 {
  public static void main(String[] args) {
    List<String> words= Arrays.asList("apple", "banana", "cherry", "date");
    long count = words.stream()
    .filter(word -> words.contains("a"))
    .count();

    System.out.println(count);
  }
}
