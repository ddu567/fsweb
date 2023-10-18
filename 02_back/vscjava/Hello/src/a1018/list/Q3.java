package a1018.list;

import java.util.ArrayList;

public class Q3 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("apple");
    list.add("banana");
    list.add("cherry");
    list.add("date");

    list.remove("banana");

    System.out.println(list);
  }
}
