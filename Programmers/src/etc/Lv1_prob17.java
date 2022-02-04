package etc;

/*
    etc.Lv01_prob17 : 내적
    url : https://programmers.co.kr/learn/courses/30/lessons/70128
 */


public class Lv1_prob17 {

    public static void solution(int[] a, int[] b){
        int answer = 0;
        int length = a.length;

        for(int i=0; i<length; i++){
            answer += (a[i] * b[i]);
        }

        System.out.println(answer);
    }



    public static void main(String[] args) {
        int[] a1 = new int[] {1, 2, 3, 4};
        int[] b1 = new int[] {-3, -1, 0, 2};

        int[] a2 = new int[] {-1, 0, 1};
        int[] b2 = new int[] {1, 0, -1};

        solution(a1, b1);
        solution(a2, b2);
    }
}
