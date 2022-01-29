package etc;

/*
    etc.Lv01_prob08 : 나머지가 1이 되는 수 찾기
    url : https://programmers.co.kr/learn/courses/30/lessons/87389
 */

public class Lv1_prob08 {
    public static void solution(int n){
        int answer = 0;

        for(int i=2; i<n; i++){
            if( (n-1) % i == 0){
                answer = i;
                break;
            }
        }
        System.out.println(answer);

    }

    public static void main(String[] args) {

        solution(10);
        solution(12);

    }
}
