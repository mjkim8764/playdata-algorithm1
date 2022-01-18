package week1;

/*
    Week1.Prob12 : 짝수와 홀수
    정수 num이 짝수일 경우 "Even" 출력, 홀수인 경우 "Odd"를 출력
 */

public class Prob12 {
    public static void main(String[] args) {
        int num = 4;
        System.out.println( (num%2==0) ? "Even" : "Odd");

    }
}