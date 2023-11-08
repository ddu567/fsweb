package a1005;
// 배열 요소 뒤집기

public class A1005_q4 {
  public static void main(String[] args) {
    String[] array = { "apple", "banana", "cherry", "date" };

    for (int i = 0; i < array.length / 2; i++) {
      String temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }

    System.out.println("배열 요소 뒤집기:");
    // str에 array 입력
    for (String str : array) {
      System.out.println(str);
    }
  }
}
