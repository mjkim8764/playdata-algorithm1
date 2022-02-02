package etc;

/*
    etc.Lv01_prob14 : 문자열 내림차순으로 배치하기
    url : https://programmers.co.kr/learn/courses/30/lessons/12917
 */

import java.util.Arrays;

public class Lv1_prob14 {

    public static void solution(String s){
        String answer = "";
        int length = s.length();
        int[] s_int = new int[length];
        for(int i=0; i<length; i++)
            s_int[i] = s.charAt(i);
        Arrays.sort(s_int);
        for(int i=0; i<length; i++)
            answer += (char)s_int[length-i-1];

        System.out.println(answer);
    }

    public static void main(String[] args) {
        String s1 = "Zbcdefg";
        solution(s1);
    }
}
