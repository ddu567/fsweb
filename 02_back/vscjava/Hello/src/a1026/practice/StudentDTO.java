package a1026.practice;

// DTO는 Data Transfer Object의 약자로, 계층 간(Controlelr, View, Business Layer) 데이터 교환을 위한 Java Bean를 의미한다. DTO는 로직을 가지지 않는 데이터 객체이고, getter, setter 메소드만 가진 클래스를 의미한다.
public class StudentDTO {
  private int id;
  private String name;
  private int age;
  private int kor;
  private int eng;
  private int math;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
  }

  public StudentDTO(int id, String name, int age, int kor, int eng, int math) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  // 기본 생성자
  public StudentDTO() {

  }

  // toString
  public String toString() {
    return " " + id + "\t" + name + "\t" + age + "\t" + kor + "\t" + eng + "\t" + math;
  }

}