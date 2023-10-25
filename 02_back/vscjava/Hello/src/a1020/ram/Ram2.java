package a1020.ram;

interface Calculator1 {
  int sum(int a, int b);
}


public class Ram2 {
  public static void main(String[] args) {
    Calculator1 mc = (int a, int b) -> a + b;
    // Calculator1 mc = (a, b) -> a + b; (O)
    int result = mc.sum(3, 4);
    System.out.println(result);
  }
}
