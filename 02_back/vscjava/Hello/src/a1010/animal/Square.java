package a1010.animal;

public class Square {
  // 1. 필드를 추가하시오.
  int length; // 한 변의 길이

  // 2. 메소드를 작성하시오.
  void area() {
    System.out.println("한 변의 길이가 " + length + "인 정사각형의 넓이: " + length * length);
    // 3. 메인 메소드를 완성하시오.
  }
  
  /* 
    선생님
    int area(){
      return length * length;
    }
  */

  public static void main(String[] args) {
    // 객체 생성
    Square sqr1 = new Square();
    // 필드 초기화
    sqr1.length = 4;
    // 결과 출력
    sqr1.area();
    /* 
      선생님
      System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", sqr1.length, sqr1.area());
    */
  }
}
