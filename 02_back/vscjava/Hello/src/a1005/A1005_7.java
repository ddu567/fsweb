package a1005;
// 문자열 잘라내기 substring()

public class A1005_7 {
  public static void main(String[] args) {
    String ssn = "880815-1234567";

    String firstNum = ssn.substring(0,6);
    System.out.println((firstNum));
    String secondNum = ssn.substring(7);
    System.out.println((secondNum));
  }
}
