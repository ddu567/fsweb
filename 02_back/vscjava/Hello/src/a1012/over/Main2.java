package a1012.over;

class MyObject extends Object { // extends Object는 생략해줘도 된다.
  int objId;
  String objName;

  public MyObject(int objId, String objName) {
    this.objId = objId;
    this.objName = objName;
  }
  @Override
  public String toString(){
    return String.format("제품번호: %d, 제품이름: %s", this.objId,this.objName);
  }
}

public class Main2 {
  public static void main(String[] args) {
    MyObject o1 = new MyObject(101, "First Object");
    MyObject o2 = new MyObject(102, "Second Object");


    // 클래스 타입 이름 @ 객체주소 해시코드
    System.out.println(o1); // MyObject@606d8acf
    // 재정의시 toString() 생략 가능
    System.out.println(o2.toString()); // MyObject@782830e
  }
}
