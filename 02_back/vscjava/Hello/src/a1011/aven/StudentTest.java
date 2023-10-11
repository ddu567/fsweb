package a1011.aven;

public class StudentTest {
  public static void main(String[] args) {
    Student Park = new Student(2019122104, "Park");
    Student Kim  = new Student(2019060208, "Kim");
    Student Lee = new Student(2019153237, "Lee");
    System.out.printf("회원아이디는: %d\t 회원이름은: %s\n", Park.id, Park.name);
    System.out.printf("회원아이디는: %d\t 회원이름은: %s\n", Kim.id, Kim.name);
    System.out.printf("회원아이디는: %d\t 회원이름은: %s\n", Lee.id, Lee.name);
    System.out.printf("Student 객체의 수: %d", Student.count);
  }
}

class Student {
  
  static int count = 0; // 클래스변수, static 필드, 정적 변수, 공용 변수, ...

  int id; // 인스턴스 변수
  String name;

  Student(int _id, String _name){
    Student.count++;
    id = _id;
    name = _name;
  }
}
