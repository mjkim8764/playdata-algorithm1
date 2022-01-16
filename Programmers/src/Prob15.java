/*
    Prob15 : 정수 제곱근 판별
    n이 양의 정수 x의 제곱이라면 x+1의 제곱을 출력
    n이 양의 정수 x의 제곱이 아니라면 -1을 출력
 */

public class Prob15 {
    public static void main(String[] args) {
        long n1 = 121;
        long n2 = 3;

        long answer1 = ( (long)(Math.sqrt(n1)) == (double)(Math.sqrt(n1)) ? (long)Math.pow( Math.sqrt(n1)+1, 2) : -1 );
        long answer2 = ( (long)(Math.sqrt(n2)) == (double)(Math.sqrt(n2)) ? (long)Math.pow( Math.sqrt(n2)+1, 2) : -1 );

        System.out.println(answer1 + " " + answer2);
    }
}