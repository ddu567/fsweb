package a1017;

public class Concat {
  public static void main(String[] args) {
    String str = new String("java");
    System.out.println("원본 문자열: " + str);
    
    System.out.println(str.concat("수업")); // java수업
    System.out.println("concat() 메소드 호출후 원본 문자열: " + str);
  }
}