/*
    Prob13 : 자릿수 더하기
    자연수 n의 각 자릿수의 합을 더해서 출력
    ex) n=123 이면 6 출력
 */

public class Prob13 {
    public static void main(String[] args) {
        int n = 4123;
        int answer = 0;

        int length = (int)Math.log10(n);
        for(int i=0; i<=length; i++){
            answer += ((n >= 10) ? (n%10) : n);
            n /= 10;
        }

        System.out.println(answer);
    }
}