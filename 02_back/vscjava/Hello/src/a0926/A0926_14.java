package a0926;

public class A0926_14 {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 10;
    boolean result1 = (num1 == num2);
    boolean result2 = (num1 != num2);
    boolean result3 = (num1 <=  num2);
    System.out.println("result1: " + result1);
    System.out.println("result2: " + result2);
    System.out.println("result3: " + result3);

    char char1 = 'A';
    char char2 = 'B';
    boolean result4 = (char1 < char2); // 65 < 66
    System.out.println("result4: " + result4);

    int num3 = 1;
    double num4 = 1.0;
    boolean result5 = (num3 == num4);
    System.out.println("result5: " + result5);

    float num5 = 0.1f;
    double num6 = 0.1; // 부동소수점
    boolean result6 = (num5 == num6);
    boolean result7 = (num5 == (float)num6);
    System.out.println("result6: " + result6);
    System.out.println("result7: " + result7);

    String str1 = "자바";
    String str2 = "Java";
    String str3 = new String("Java");
    String str4 = new String("Java");
    String str5 = str4;

    boolean result8 = (str1.equals(str2));
    boolean result9 = (! str1.equals(str2));
    boolean result10 = (str2.equals(str3));
    boolean result11 = (str2 == str3);
    boolean result12 = (str2.equals(str3));
    boolean result13 = (str3 == str4);
    boolean result14 = (str3.equals(str4));
    boolean result16 = (str4.equals(str5));
    System.out.println("result8: " + result8);
    System.out.println("result9: " + result9);
    System.out.println("result10: " + result10);
    System.out.println("result11: " + result11);
    System.out.println("result12: " + result12);
    System.out.println("result13: " + result13);
    System.out.println("result14: " + result14);
    System.out.println("result16: " + result16);
  }
}
