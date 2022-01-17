package Week1;

/*
    Week1.Prob08 : x만큼 간격이 있는 n개의 숫자
             x부터 시작해 x씩 증가하는 숫자를 n개 지나는 리스트 출력
             ex1) x=2, n=5    :     [2,4,6,8,10]
             ex2) x=4, n=3    :     [4,8,12]
             ex3) x=-4, n=2   :     [-4,-8]
 */

public class Prob08 {
    public static void solution(int x, int n){

        //Init
        long[] answer = new long[n];
        answer[0] = x;

        for(int i=1; i<answer.length; i++)
            answer[i] = answer[i-1] + x;

        /*
        for(int i=0; i<answer.length; i++)
            System.out.println(answer[i]);

         */
    }

    public static void main(String[] args) {
        solution(4, 5);
        solution(-4, 2);
    }
}