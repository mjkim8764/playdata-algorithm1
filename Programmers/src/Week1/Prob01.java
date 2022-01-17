package Week1;

/*
  Week1.Prob01 : 두 정수 a, b 사이에 속한 정수의 합
  ex) a=3, b=5 일 때 12 return
 */

public class Prob01 {
    public static long solution(int a, int b) {
        long answer = 0;
        int temp;

        // swap a & b
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }

        for(int i = a; i <= b; i++){
            answer += i;
        }


        /* Refactoring
        for(int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }

        */

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(5, 3));
    }
}