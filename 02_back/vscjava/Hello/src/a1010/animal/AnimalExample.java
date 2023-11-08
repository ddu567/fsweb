package a1010.animal;

public class AnimalExample {
  public static void main(String[] args) {
    Animal dog1 = new Animal("따따", "포메라니안", 3);
    Animal dog2 = new Animal("뽀뽀", "비숑", 2);

    System.out.println("이름: " + dog1.name);
    System.out.println("품종: " + dog1.breeds);
    System.out.println("나이: " + dog1.age);
    System.out.println();
    System.out.println("이름: " + dog2.name);
    System.out.println("품종: " + dog2.breeds);
    System.out.println("나이: " + dog2.age);

  }
}
