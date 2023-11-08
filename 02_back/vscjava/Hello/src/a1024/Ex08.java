package a1024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// 문제 3: 사람 목록에서 나이가 가장 어린 사람 찾기

public class Ex08 {
  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
      new Person("Alice", 25),
      new Person("Bob", 30),
      new Person("Charlie", 22));

    // int min = people.stream()
    //   .map(Person::getAge)
    //   .max(Integer::compareTo)
    //   .orElse(-1);
    //   System.out.println(min);

    Optional<Person> youngestPerson = people.stream()
    .min(Comparator.comparing(Person::getAge));

    // 출력
    System.out.println(youngestPerson); // 번지수 출력
    youngestPerson.ifPresent(person -> System.out.println("가장 어린 사람: " + person.getName()));
    
    String youngestName = youngestPerson.map(Person::getName).orElse("No youngest person found");
    System.out.println("Youngest person: " + youngestName);

  }
}

 class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

