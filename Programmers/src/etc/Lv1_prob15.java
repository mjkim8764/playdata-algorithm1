package etc;

/*
    etc.Lv01_prob15 : 문자열 내 마음대로 정렬하기
    url : https://programmers.co.kr/learn/courses/30/lessons/12915

 */

import java.util.Arrays;

public class Lv1_prob15 {

    public static void solution(String[] strings, int n){
        int length = strings.length;
        String[] answer = new String[length];


        for(int i=0; i<length; i++) {
            strings[i] = strings[i].charAt(n) +
                         strings[i].substring(0, n) +
                         strings[i].substring(n + 1);
        }

        Arrays.sort(strings);

        for(int i=0; i<length; i++) {
            answer[i] = strings[i].substring(1, n + 1) +
                        strings[i].charAt(0) +
                        strings[i].substring(n + 1);
            System.out.println(answer[i]);
        }
    }

    public static void main(String[] args) {
        String[] strings1 = {"sun", "bed", "car"};
        int n1 = 1;

        String[] strings2 = {"abcedddd", "abceaaaa", "cdxaaaaaa"};
        int n2 = 5;

        String[] strings3 = {"abzcd", "cdzab", "abzfg", "abzaa", "abzbb", "bbzaa"};
        int n3 = 2;

        solution(strings1, n1);
        solution(strings2, n2);
        solution(strings3, n3);
    }
}