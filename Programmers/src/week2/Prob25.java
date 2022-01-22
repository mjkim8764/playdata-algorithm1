package week2;

/*
    Week2.Prob25 : 완주하지 못한 선수
    url : https://programmers.co.kr/learn/courses/30/lessons/12901
 */

public class Prob25 {

    public static void solution(int a, int b) {
        String answer = "";

        int[] days = new int[]{0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        answer += day[(days[a - 1] + b + 4) % 7];

        System.out.println(answer);

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        solution(a, b);
    }
}