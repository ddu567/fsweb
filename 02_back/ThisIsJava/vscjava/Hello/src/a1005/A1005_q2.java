package a1005;
// 최대값과 최소값 찾기

public class A1005_q2 {
  public static void main(String[] args) {
    int[] array =  { 10, 5, 8, 21, 3 };

    // 최댓값
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    System.out.println("최댓값: " + max);

    // 최솟값
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
      if (min > array[i]) {
        min = array[i];
      }
    }
    System.out.println("최솟값: " + min);
  }
}
