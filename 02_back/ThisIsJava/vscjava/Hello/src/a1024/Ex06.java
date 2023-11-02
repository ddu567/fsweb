package a1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 문제 1: 문자열 목록에서 길이가 3 이하인 문자열 제외하기

public class Ex06 {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");
    List<String> wordLength = strings.stream()
        .filter(word -> word.length() > 3)
        .distinct()
        .collect(Collectors.toList());
    System.out.println(wordLength);
  }
}
