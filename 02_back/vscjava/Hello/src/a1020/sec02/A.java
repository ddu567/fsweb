package a1020.sec02;

public class A {
  // 인스턴스 멤버 클래스
  class B {}

  // 인스턴스 필드 값으로 B 객체 대입
  B field = new B();

  // 생성자
  A() {
    B b = new B();
  }
}
