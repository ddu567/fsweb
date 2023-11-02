package exam;

import java.util.Scanner;

public class Ex43 {
  private final static String[] num = { "", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
  private final static String[] han1 = { "", "십", "백", "천" };
  private final static String[] han2 = { "", "만", "억", "조", "경" };

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    while (true) {
      System.out.print("수 입력: ");
      int n = s.nextInt();
      if (n == 0)
        break;
      String num = String.valueOf(n);
      String result = "";
      if (num.startsWith("-")) {
        result = "마이너스";
        num = num.substring(1);
      }
      result += convert(num);
      System.out.println("--> " + result);
    }
    System.out.println("종료합니다 bye~");
    s.close();
  }

  public static String convert(String number) {
    StringBuilder sb = new StringBuilder();
    int len = number.length();
    for (int i = len - 1; i >= 0; i--) {
      String s = number.substring(len - i - 1, len - i);
      int n = Integer.valueOf(s);
      sb.append(num[n]);
      if (n > 0)
        sb.append(han1[i % 4]);
      if (i % 4 == 0)
        sb.append(han2[i / 4]);
    }
    return sb.toString();
  }
}

// https://kin.naver.com/qna/detail.naver?d1id=1&dirId=1040201&docId=301980098&qb=7J6Q67CUIOyIq+yekOulvO2VnOq4gOuhnA==&enc=utf8&section=kin.ext&rank=1&search_sort=0&spq=0
