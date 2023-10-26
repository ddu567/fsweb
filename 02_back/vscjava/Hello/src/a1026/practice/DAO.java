package a1026.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class DAO {
  Scanner scan = new Scanner(System.in);

  private ArrayList<StudentDTO> stlist;

  // 파일 생성
  private FileClass file = new FileClass("sun", "studentInfo");

  // 생성자 constructor
  public DAO() {
    stlist = new ArrayList<StudentDTO>();

    // 테스트용 데이터
    StudentDTO s1 = new StudentDTO(0, "테스트1", 11, 100, 90, 80);
    StudentDTO s2 = new StudentDTO(1, "테스트1", 22, 90, 89, 91);
    StudentDTO s3 = new StudentDTO(2, "테스트1", 33, 85, 77, 55);
    StudentDTO s4 = new StudentDTO(3, "테스트1", 44, 77, 68, 85);

    stlist.add(s1);
    stlist.add(s2);
    stlist.add(s3);
    stlist.add(s4);
  }

  // CRUD
  // create
  private void insert(StudentDTO st) {
    // 데이터 추가
    stlist.add(st);
  }

  // delete
  private void delete(int index) {
    stlist.remove(index);
  }

  // search
  private StudentDTO select(int index) {
    return stlist.get(index);
  }

  // update
  private void update(int index, StudentDTO st) {
    stlist.set(index, st);
  }

  // user Insert
  public void userInsert() {
    StudentDTO st = new StudentDTO();
    System.out.println("학생 정보 입력");
    System.out.println("아이디");
    int id = scan.nextInt();
    System.out.println("이름");
    String name = scan.next();
    System.out.println("나이");
    int age = scan.nextInt();
    System.out.println("국어");
    int kor = scan.nextInt();
    System.out.println("영어");
    int eng = scan.nextInt();
    System.out.println("수학");
    int math = scan.nextInt();

    st.setId(id);
    st.setName(name);
    st.setAge(age);
    st.setKor(kor);
    st.setEng(eng);
    st.setMath(math);
    insert(st);
  }

  // index finder
  private int findIndex() {
    System.out.print("학생 이름을 입력하시오: ");
    String name = scan.next();
    for (int i = 0; i < stlist.size(); i++) {
      if (stlist.get(i).getName().equals(name)) {
        return i;
      }
    }
    return -1;
  }

  // userDelete
  public void userDelete() {
    int index = findIndex();
    if (index != -1) {
      delete(index);
      System.out.println("학생을 삭제했습니다.");
    } else {
      // 이름이 없는 경우
      System.out.println("해당 학생이 없습니다.");
    }
  }

  // userSelect
  public void userSelect() {
    int index = findIndex();
    if (index != -1) { // 인덱스 있는 경우
      StudentDTO st = select(index);
      int id = st.getId();
      String name = st.getName();
      int age = st.getAge();
      int kor = st.getKor();
      int eng = st.getEng();
      int math = st.getMath();
      System.out.println("< " + name + " 학생의 정보 >");
      System.out.println("- 아이디: " + id);
      System.out.println("- 나이: " + age);
      System.out.println("- 국어: " + kor);
      System.out.println("- 영어: " + eng);
      System.out.println("- 수학: " + math);
    }
  }

  // userUpdate
  public void userUpdate() {
    int index = findIndex();
    if (index != -1) {
      StudentDTO st = new StudentDTO();
      st.setId(stlist.get(index).getId());
      st.setName(stlist.get(index).getName());
      System.out.println("< " + st.getName() + " > 학생 회원 정보 수정");
      System.out.println("아이디: " );
      st.setId(scan.nextInt());
      System.out.println("이름: ");
      st.setName(scan.next());
      System.out.println("나이: ");
      st.setAge(scan.nextInt());
      System.out.println("국어: ");
      st.setKor(scan.nextInt());
      System.out.println("영어: ");
      st.setEng(scan.nextInt());
      System.out.println("수학: ");
      st.setMath(scan.nextInt());

      update(index, st);
      System.out.println("수정되었습니다.");
    } else {
      System.out.println("해당 학생이 없습니다.");
    }
  }

  // printAll
  public void printAll() {
    System.out.println("<전체 학생 목록>");
    int index = 1;
    for (int i = 0; i < stlist.size(); i++) {
      System.out.println("<" + index + "." + stlist.get(i).getName() + " 학생 >");
      System.out.println("아이디: " + stlist.get(i).getId());
      System.out.println("나이: " + stlist.get(i).getAge());
      System.out.println("국어: " + stlist.get(i).getKor());
      System.out.println("영어: " + stlist.get(i).getEng());
      System.out.println("수학: " + stlist.get(i).getMath());
      index++;
    }
  }

  // dataSave
public void dataSave() throws Exception {
  file.create();
  String str = " 아이디\t 이름\t 나이\t 국어\t 영어\t 수학\n" +"-------------------------------------------------------------\n";
  for (int i = 0; i<stlist.size(); i++) {
    str += stlist.get(i).toString() + "\n";
  }
  System.out.println("데이터를 저장했습니다.");
  file.write(str);
}

  // dataLoad
  public void dataLoad() {
    try {
      file.read();
    } catch (Exception e) {
      System.out.println("읽을 파일이 없습니다.");
    }
  }

}
