package etc;

/*
    etc.Lv02_prob21 : 카펫
    url : https://programmers.co.kr/learn/courses/30/lessons/42842
 */

import java.util.ArrayList;

public class Lv2_prob21 {

    public static void solution(int brown, int yellow) {
        ArrayList<Integer> bx = new ArrayList<>();
        ArrayList<Integer> by = new ArrayList<>();
        ArrayList<Integer> yx = new ArrayList<>();
        ArrayList<Integer> yy = new ArrayList<>();
        int[] answer = new int[2];

        brown += yellow;

        // yellow 가로, 세로 조합 입력
        for(int i=1; i<=(int)Math.sqrt(yellow); i++){
            if(yellow % i == 0) {
                yy.add(i);
                yx.add(yellow / i);
            }
        }

        // brown 가로, 세로 조합 입력
        for(int i=1; i<=(int)Math.sqrt(brown); i++){
            if(brown % i == 0){
                by.add(i);
                bx.add(brown / i);
            }
        }

        // (brown의 가로 & 세로) = (yellow의 가로 & 세로) + 2
        for(int i=0; i<bx.size(); i++) {
            for(int j=0; j<yx.size(); j++) {
                if( (bx.get(i) == yx.get(j) + 2) && (by.get(i) == yy.get(j) + 2)) {
                    answer[0] = bx.get(i);
                    answer[1] = by.get(i);
                    System.out.println(answer[0] + " " + answer[1]);
                }
            }
        }

    }

    public static void main(String[] args) {
        int brown1 = 10;
        int yellow1 = 2;

        int brown2 = 8;
        int yellow2 = 1;

        int brown3 = 24;
        int yellow3 = 24;

        solution(brown1, yellow1);
        solution(brown2, yellow2);
        solution(brown3, yellow3);
    }
}
