package a1020.sec02;

public class AExample {
  public static void main(String[] args) {
    // A객체 생성
    A a = new A();

    // B객체 생성
    A.B b = a.new B();
  }
}
