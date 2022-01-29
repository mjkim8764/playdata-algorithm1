package etc;

/*
    etc.Lv01_prob06 : 부족한 금액 계산하기
    url : https://programmers.co.kr/learn/courses/30/lessons/82612
 */

public class Lv1_prob07 {

    public static void solution(int price, int money, int count){
        long answer = -1;
        long sum = (long)price * ((1 + count) * count / 2);
        answer = money - sum < 0 ? -(money - sum) : 0;

        System.out.println(answer);
    }

    public static void main(String[] args) {

        solution(3, 20, 4);

    }
}