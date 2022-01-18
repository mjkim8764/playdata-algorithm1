package week2;

/*
    Week2.Prob17 : 정수 내림차순으로 배치하기
    정수 n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 반환
 */

import java.util.ArrayList;
import java.util.Collections;

public class Prob17 {

    public static long solution(long n){
        long answer = 0;
        long prenum = n;
        ArrayList<Long> list = new ArrayList<>();

        for(long i=0; i<Math.log10(prenum); i++){
            list.add(n % 10);
            n /= 10;
        }

        Collections.sort(list);

        for(int i=0; i<Math.log10(prenum); i++){
            answer +=  ( list.get(i) * Math.pow(10, i) );
        }

        return answer;

    }

    public static void main(String[] args) {
        long n1 = 118372;
        long n2 = 14391342;

        System.out.println(solution(n1));
        System.out.println(solution(n2));

    }
}