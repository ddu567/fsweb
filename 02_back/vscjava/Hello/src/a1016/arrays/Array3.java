package a1016.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("배열의 크기를 입력하세요: ");
    int size = scan.nextInt();
    int[] numbers = new int[size];
    System.out.println("배열에 숫자를 입력하세요: ");

    for (int i = 0; i < size; i++) {
      System.out.println("배열 요소 " + (i + 1) + ": ");
      numbers[i] = scan.nextInt();
    }
    System.out.println("입력한 배열 요소: " + Arrays.toString(numbers));

    scan.close();
  }
}
