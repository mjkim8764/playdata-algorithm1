package Week1;

/*
    Week1.Prob14 : 최대공약수와 최소공배수
    두 수 n, m의 최대공약수와 최소공배수를 출력
 */

public class Prob14 {
    public static void main(String[] args) {
        int n = 6;
        int m = 8;

        int a = Math.max(n, m);
        int b = Math.min(n, m);
        int r = -1;


        //GCD(a, b) = GCD(a, a % b)
        while(r != 0){
            r = a % b;
            a = b;
            b = r;
        }

        System.out.println("GCD : " + a);
        System.out.println("LCD : " + (n * m / a));         //LCM(n, m) * GCD(n, m) = n * m

    }
}