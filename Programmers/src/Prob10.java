/*
    Prob10 : 평균 구하기
    정수를 담고 있는 배열 arr의 평균값 출력
 */

public class Prob10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        double answer = 0;

        for(int i=0; i<arr.length; i++)
            answer += arr[i];

        System.out.println(answer / arr.length);
    }
}