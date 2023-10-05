package a1005;
// 배열 요소의 합

public class A1005_q1 {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    
        int sum = 0;
    for(int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    System.out.println("배열 요소의 합: " + sum);
  }
}
