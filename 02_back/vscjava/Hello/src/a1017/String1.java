package a1017;

public class String1 {
  public static void main(String[] args) {
    String str = new String("java");
    System.out.println("원본 문자열: " + str);
    for (int i = 0; i <str.length(); i++){
      System.out.println(str.charAt(i) + " ");
    }
    System.out.println("\ncharAt() 메소드 호출 후 원본문자열: " + str);
  }
}
