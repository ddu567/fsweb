package hw;

public class Ch5_8 {
    public static void main(String[] args) {
        int[][] array = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 }
        };
        
        //변수 선언
        int sum = 0;
        double avg = 0;

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                // 횟수 증가 -> 총 덧셈 숫자 값
                count++;
            }
        }
        avg = (double) sum / count;

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
