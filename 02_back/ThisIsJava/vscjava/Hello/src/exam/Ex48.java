package exam;

import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("생년월일(6자리)을 입력해주세요>");
        String front = scan.next();

        System.out.print("성별 정보를 입력해주세요>");
        int gender = scan.nextInt();

        // 숫자 추출 방법을 모름. 문자열 추출 방법은 알기에 숫자를 문자열로 변환하여 입력 값의 앞 두 자리 추출
        String mid = front.substring(0, 2);
        // 계산을 위해 문자열을 다시 숫자열로 변환
        int age = Integer.parseInt(mid);
        

        if (gender == 1 || gender == 2) {
            System.out.println(124-age);
        } else {
            System.out.println(24-age);
        }

        scan.close();
    }
}
