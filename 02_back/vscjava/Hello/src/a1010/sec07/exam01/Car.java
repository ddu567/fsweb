package a1010.sec07.exam01;

public class Car {
  // 필드 선언
  String model;
  String color;
  int maxSpeed;

  Car(String model, String color, int maxSpeed) {
    // 변수명이 같아서 this. 사용
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }

}
