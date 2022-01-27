package etc;

/*
    etc.Lv01_prob01 : 약수의 개수와 덧셈
    url : https://programmers.co.kr/learn/courses/30/lessons/77884

 */

public class Lv1_prob01 {

    public static void solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++){
            if( (int)(Math.sqrt(i)) == (Math.sqrt(i)) ){
                answer -= i;
            }
            else{
                answer += i;
            }
        }

        System.out.println(answer);

    }

    public static void main(String[] args) {
        int left1 = 13;
        int right1 = 17;

        int left2 = 24;
        int right2 = 27;

        solution(left1, right1);
        solution(left2, right2);
    }
}