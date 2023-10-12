package a1012.ch25;

public class Ex7 {
  public static void main(String[] args) {
    Car car = null;
    FireEngine fe = new FireEngine();
    FireEngine fe2 = null;

    fe.water();
    car = fe; // car = (Car)fe;에서 형변환이 생략됨
    // car.water();
    fe2 = (FireEngine) car; // 자손타입
    fe2.water();
  }
}

class Car {
  String color;
  int door;

  void drive() { // 운전하는 기능
    System.out.println("drive, Brrr~");
  }

  void stop() { // 멈추는 기능
    System.out.println("stop!!!");
  }
}

class FireEngine extends Car { // 소방차
  void water() { // 물뿌리는 기능
    System.out.println("water!!!");
  }
}
