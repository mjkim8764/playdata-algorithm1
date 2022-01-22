package week2;

/*
    Week2.Prob26 : 소수 찾기
    url : https://programmers.co.kr/learn/courses/30/lessons/12921
 */

public class Prob26 {

    public static void solution(int n){
        int answer = 0;
        boolean prime = true;

        for(int i=2; i<=n; i++) {
            int isqrt = (int)Math.sqrt(i);
            prime = true;
            for(int j=2; j<=isqrt; j++){
                if(i % j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime)
                answer++;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;
        solution(n1);
        solution(n2);
    }
}
