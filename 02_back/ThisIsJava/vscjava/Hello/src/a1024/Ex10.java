package a1024;
// 문제 5: 사람 목록에서 특정 조건을 만족하는 사람 수 구하기

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Ex10 {
  public static void main(String[] args) {
    // 성별이 여성인 사람수 구하기
    List<Person> people = Arrays.asList(
        new Person("Alice", 25, "여성"),
        new Person("Bob", 30, "남성"),
        new Person("Charlie", 22, "여성"));

    long femaleCount = people.stream()
        .filter(person -> "여성".equals(person.getGender()))
        .count();
        
    System.out.println(femaleCount);

    // 나이가 25살 이상인 사람을 필터링하여 새로운 리스트에 저장 후 출력
    List<Person> filteredPeople = people.stream()
      .filter(person -> person.getAge() >= 25)
      .collect(Collectors.toList());

      for(Person person : filteredPeople) {
        System.out.println("name: " + person.getName() + ", age" + person.getAge()) ;
      }
      filteredPeople.forEach(person -> {
        System.out.println("name: " + person.getName() + ", age: " +person.getAge());
      });
  }
}



class Person {
  private String name;
  private int age;
  private String gender;

  public Person(String n, int a, String g) {
    this.name = n;
    this.age = a;
    this.gender = g;
  }
  
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }


}
