package a0927;

public class A0927_5 {
  public static void main(String[] args) {
    int score = 85;
    char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
    System.out.println(score + "점은 " + grade + "등급입니다.");

    int x = 10;
    int y = 20;
    int z = (++x) + (y--);

    System.out.println(z);

    int point = 75;
    if(point >=90 ){
      System.out.println("점수가 90~100점입니다.");
      System.out.println("등급은 A입니다.");
    } else if(point >=80){
      System.out.println("점수가 80~89점입니다.");
      System.out.println("등급은 B입니다.");
    } else if(point >= 70){
      System.out.println("점수가 70~79점입니다.");
      System.out.println("등급은 C입니다.");
    } else if(point < 70){
      System.out.println("점수가 70점 미만입니다.");
      System.out.println("등급은 D입니다.");
    }
  }
}
