package etc;

/*
    etc.Lv01_prob20 : 로또의 최고 순위와 최저 순위
    url : https://programmers.co.kr/learn/courses/30/lessons/77484
 */

public class Lv1_prob20 {

    public static void solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int wins = 0;
        int zero_cnt = 0;
        for(int i=0; i<6; i++) {
            if(lottos[i] == 0)
                zero_cnt++;
            else {
                for(int j=0; j<6; j++) {
                    if (lottos[i] == win_nums[j])
                        wins++;
                }
            }
        }
        answer[1] = (wins == 0) ? 6 : 7 - wins;
        if (wins == 0 && zero_cnt == 0) {
            answer[0] = 6;
        } else {
            answer[0] = (wins == 0) ? 7 - zero_cnt : answer[1] - zero_cnt;
        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }

    public static void main(String[] args) {
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};

        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};

        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};

        int[] lottos4 = {1, 2, 3, 4, 5, 6};
        int[] win_nums4 = {7, 8, 9, 10, 11, 12};

        solution(lottos1, win_nums1);
        solution(lottos2, win_nums2);
        solution(lottos3, win_nums3);
        solution(lottos4, win_nums4);
    }

}