package etc;

/*
    etc.Lv01_prob05 : 콜라츠 추측
    url : https://programmers.co.kr/learn/courses/30/lessons/12943
 */

public class Lv1_prob05 {

    public static void solution(int num){
        int answer = 0;
        long l_num = num;

        while(l_num != 1) {
            if(answer == 500) {
                answer = -1;
                break;
            }
            else {
                l_num = (l_num % 2) == 0 ? l_num / 2 : l_num * 3 + 1;
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 16;
        int n3 = 626331;
        solution(n1);
        solution(n2);
        solution(n3);
    }

}
