package exam;

public class Ex59_t {
  public static void main(String[] args) {

    int[] lotto = { 13, 23, 24, 35, 40, 45 };
    int bonus = 7;
    int[] myNumber = { 13, 23, 8, 35, 40, 45 };
    int count = 0;
    int bonusCount = 0;

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (myNumber[i] == lotto[j]) {
          count++;
        }
      }
    }

    if (count == 6) {
      System.out.println("1등 당첨");
    } else if (count == 5) {
      for (int i = 0; i < 6; i++) {
        if (myNumber[i] == bonus) {
          bonusCount++;
        }
      }

      if (bonusCount > 0) {
        System.out.println("2등 당첨");
      } else {
        System.out.println("3등 당첨");
      }
    } else if (count == 4) {
      System.out.println("4등 당첨");
    } else if (count == 5) {
      System.out.println("5등 당첨");
    } else {
      System.out.println("꽝! 다음 기회에~");
    }
  }
}
