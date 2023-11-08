package a1017;

public class StringuilderExample {
  public static void main(String[] args) {
    String data = new StringBuilder()
      .append("EDF")
      .insert(0, "ABC")
      .delete(3,4)
      .toString();
      System.out.println(data);
  }
}
