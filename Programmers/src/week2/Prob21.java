package week2;

/*
    Week2.Prob21 : 하샤드 수
    x가 x의 각 자릿수의 합으로 나누어 떨어지면 x는 하샤드 수
    x가 하샤드 수 인지 판별
    ex) x = 10 : true
        x = 11 : false
        x = 12 : true
        x = 13 : false
 */

import java.util.ArrayList;

public class Prob21 {

    public static boolean solution(int x){
        int count = (int)Math.log10(x) + 1;
        int temp = x;
        int sum = 0;

        for(int i=0; i<count; i++) {
            sum += (temp % 10);
            temp /= 10;
        }

        return (x % sum == 0) ? true : false;
    }

    public static void main(String[] args) {

        int x = 13;
        System.out.println(solution(x));

    }
}