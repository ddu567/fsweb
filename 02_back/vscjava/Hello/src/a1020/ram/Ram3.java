package a1020.ram;

interface Calculator2 {
  int sum(int a, int b);
}

public class Ram3 {
  public static void main(String[] args) {
    // Calculator2 mc = (int a, int b) -> a + b;
    // Calculator2 mc = Integer.sum(int a, int b);
    Calculator2 mc = Integer::sum;
    int result = mc.sum(3, 4);
    System.out.println(result);
  }
}
