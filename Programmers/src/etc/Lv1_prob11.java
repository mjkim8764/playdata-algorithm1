package etc;

/*
    etc.Lv01_prob11 : 최소직사각형
    url : https://programmers.co.kr/learn/courses/30/lessons/86491
 */

import java.util.Arrays;

public class Lv1_prob11 {

    public static void solution(int[][] sizes) {
        int answer = 0;
        int length = sizes.length;

        int[] width = new int[length];
        int[] height = new int[length];

        for(int i=0; i<length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                width[i] = sizes[i][0];
                height[i] = sizes[i][1];
            } else {
                width[i] = sizes[i][1];
                height[i] = sizes[i][0];
            }
        }

        /*
        for(int[] size : sizes){
            // width, height 배열 필요 없이 여기서 바로 max width 사이즈와 max height 사이즈를 뽑아낼 수 있다.
        }

         */

        answer = Arrays.stream(width).max().getAsInt() * Arrays.stream(height).max().getAsInt();
        System.out.println(answer);

    }

    public static void main(String[] args) {
        int[][] sizes1 = new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2 = new int[][] {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes3 = new int[][] {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        solution(sizes1);
        solution(sizes2);
        solution(sizes3);

    }
}