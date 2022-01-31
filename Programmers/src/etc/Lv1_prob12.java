package etc;

/*
    etc.Lv01_prob11 : 음양 더하기
    url : https://programmers.co.kr/learn/courses/30/lessons/76501
 */

public class Lv1_prob12 {

    public static void solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int length = absolutes.length;

        for(int i=0; i<length; i++) {
            if(signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        System.out.println(answer);

    }


    public static void main(String[] args) {
        int[] absolutes1 = new int[] {4, 7, 12};
        boolean[] signs1 = new boolean[] {true, false, true};

        int[] absolutes2 = new int[] {1, 2, 3};
        boolean[] signs2 = new boolean[] {false, false, true};

        solution(absolutes1, signs1);
        solution(absolutes2, signs2);
    }
}