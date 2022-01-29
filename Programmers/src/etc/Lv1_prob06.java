package etc;

/*
    etc.Lv01_prob06 : 문자열을 정수로 바꾸기
    url : https://programmers.co.kr/learn/courses/30/lessons/12925
 */

public class Lv1_prob06 {

    public static void solution(String s){
        int answer = Integer.valueOf(s);
        System.out.println(answer);
    }

    public static void main(String[] args) {
        solution("-42534");
        solution("-1234");
    }

}
