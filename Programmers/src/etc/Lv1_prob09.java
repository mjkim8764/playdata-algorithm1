package etc;

/*
    etc.Lv01_prob09 : 없는 숫자 더하기
    url : https://programmers.co.kr/learn/courses/30/lessons/86051
 */

import java.util.Arrays;

public class Lv1_prob09 {
    public static void solution(int[] numbers){
        int answer = -1;
        answer = 45 - Arrays.stream(numbers).sum();

        System.out.println(answer);


    }

    public static void main(String[] args) {
        int[] numbers1 = new int[] {1, 2, 3, 4, 6, 7, 8, 0};
        int[] numbers2 = new int[] {5, 8, 4, 0, 6, 7, 9};

        solution(numbers1);
        solution(numbers2);
    }

}
