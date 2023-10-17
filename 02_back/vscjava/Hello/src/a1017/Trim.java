package a1017;

public class Trim {
  public static void main(String[] args) {
    String str = new String("   java             ");
    System.out.println("원본 문자열: " + str);

    System.out.println(str + '|');
    System.out.println(str.trim() + '|'); // 공백 제거
    System.out.println("trim() 메소드 호출 후 원본 문자열: " + str); 
  }
}
