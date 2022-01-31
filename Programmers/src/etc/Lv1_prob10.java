package etc;

/*
    etc.Lv01_prob10 : 3진법 뒤집기
    url : https://programmers.co.kr/learn/courses/30/lessons/68935
 */

import java.util.ArrayList;

public class Lv1_prob10 {

    public static void solution(int n){
        int answer = 0;
        ArrayList<Integer> third = new ArrayList<>();

        while(n > 0) {
            third.add(n % 3);
            n /= 3;
        }

        int size = third.size();
        for(int i=0; i<size; i++){
            answer += third.get(i) * Math.pow(3, size - i - 1);
        }

        System.out.println(answer);

        // Integer.parseInt(String s, int radix)

    }

    public static void main(String[] args) {
        int n1 = 45;
        int n2 = 125;

        solution(n1);
        solution(n2);

    }
}