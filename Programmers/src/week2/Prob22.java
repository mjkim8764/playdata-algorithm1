package week2;

/*
    Week2.Prob22 : 나누어 떨어지는 숫자 배열
    array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 출력
    나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담기.

    ex) arr : [5, 9, 7, 10]
        divisor : 5
        return [5, 10]

        arr : [3, 2, 6]
        divisor : 10
        return : [-1]
 */


import java.util.ArrayList;
import java.util.Arrays;

public class Prob22 {
    public static void solution(int[] arr, int divisor){
        ArrayList<Integer> al = new ArrayList<>();
        int length = arr.length;

        for(int i=0; i<length; i++){
            al.add(arr[i]);
        }

        int count = (int)( al.stream().filter(v -> v % divisor == 0).count());
        int[] answer = new int[count];

        answer = al.stream().filter(v -> v % divisor == 0).sorted().mapToInt(v -> v).toArray();
        if(answer.length==0) {
            answer = new int[] {-1};
        }

        /* Refactoring

        int[] answer = Arrays.stream(arr).filter(v -> v % divisor == 0).toArray();
        if(answer.length==0){
            answer = new int[] {-1};
        }
        Arrays.sort(answer);

        */

        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr1 = {5, 9, 7, 10};
        int[] arr2 = {2, 36, 1, 3};
        int[] arr3 = {3, 2, 6};
        int divisor1 = 5;
        int divisor2 = 1;
        int divisor3 = 10;
        solution(arr1, divisor1);
        solution(arr2, divisor2);
        solution(arr3, divisor3);
    }
}