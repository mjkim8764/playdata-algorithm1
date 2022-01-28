package etc;

/*
    etc.Lv01_prob03 : 제일 작은 수 제거하기
    url : https://programmers.co.kr/learn/courses/30/lessons/12935
 */

import java.util.Arrays;

public class Lv1_prob03 {

    public static void solution(int[] arr){

        int length = arr.length;
        int min = Arrays.stream(arr).min().getAsInt();
        int[] answer = Arrays.stream(arr).filter(v -> v != min).toArray();

        if(answer.length == 0) {
            answer = new int[] {-1};
            length++;
        }

        for(int i=0; i<length-1; i++)
            System.out.println(answer[i]);
    }

    public static void main(String[] args) {

        int[] arr1 = new int[] {4, 3, 2, 1};
        int[] arr2 = new int[] {10};

        solution(arr1);
        solution(arr2);

    }

}