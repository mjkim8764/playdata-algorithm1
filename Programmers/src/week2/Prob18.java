package week2;

/*
    Week2.Prob18 : 자연수 뒤집어 배열로 만들기
    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴
 */

public class Prob18 {

    public static void solution(long n){

        int count = (int)Math.log10(n) + 1;
        int[] answer = new int[count];

        for(int i=0; i<count; i++){
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        for(int i=0; i<count; i++)
            System.out.println(answer[i]);
    }

    public static void main(String[] args) {
        solution(12345);
        solution(232415156);
    }
}