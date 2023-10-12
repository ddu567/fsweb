package exam;

import java.util.Scanner;

public class Ex62 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("학년을 입력하세요> ");
    int grade = scan.nextInt();
    System.out.print("반을 입력하세요> ");
    int clas = scan.nextInt();
    System.out.print("학년을 입력하세요> ");
    int num = scan.nextInt();

    if (clas >= 10 && clas <=20) {
      if (num < 10) {
        System.out.println(grade + "" + clas + "00" + num);
      } else if (num >= 10 && num < 100) {
        System.out.println(grade + "" + clas + "0" + num);
      } else {
        System.out.println(grade + "" + clas + "" + num);
      }
    } else {
      if (num < 10) {
        System.out.println(grade + "0" + clas + "00" + num);
      } else if (num >= 10 && num < 100) {
        System.out.println(grade + "0" + clas + "0" + num);
      } else {
        System.out.println(grade + "0" + clas + num);
      }
      
    }

    scan.close();
  }
}
