package week2;

/*
    Week2.Prob27 : 예산
    url : https://programmers.co.kr/learn/courses/30/lessons/12982
 */

import java.util.Arrays;

public class Prob27 {

    public static void solution(int[] d, int budget){
        int answer = 0;
        int d_length = d.length;
        Arrays.sort(d);

        for(int i=0; i<d_length; i++){
            if(budget - d[i] >= 0) {
                budget -= d[i];
                answer++;
            } else {
                break;
            }
        }

        System.out.println(answer);

    }

    public static void main(String[] args) {
        int[] d1 = new int[] {1, 3, 2, 5, 4};
        int budget1 = 9;

        int[] d2 = new int[] {2, 2, 3, 3};
        int budget2 = 10;

        solution(d1, budget1);
        solution(d2, budget2);

    }
}
