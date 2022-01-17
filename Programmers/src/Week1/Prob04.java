package Week1;

/*
    Week1.Prob04 : n의 약수를 모두 더한 값을 출력
 */

public class Prob04 {
    public static void main(String[] args) {
        int n = 12;
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}