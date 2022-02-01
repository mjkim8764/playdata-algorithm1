package etc;

/*
    etc.Lv01_prob13 : 키패드 누르기
    url : https://programmers.co.kr/learn/courses/30/lessons/67256

 */

public class Lv1_prob13 {
    public static void solution(int[] numbers, String hand) {
        String answer = "";
        int length = numbers.length;
        int[] left = new int[] {4, 1};
        int[] right = new int[] {4, 3};
        int[] center = new int[2];
        int l_distance, r_distance;

        for(int i=0; i<length; i++){
            if(numbers[i] == 0) {
                numbers[i] = 11;
            }

            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer = answer + "L";
                left[0] = numbers[i] / 3 + 1;
                left[1] = 1;
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer = answer + "R";
                right[0] = numbers[i] / 3;
                right[1] = 3;
            }
            else {             //numbers[i] == 2 or 5 or 8 or 0
                center[0] = numbers[i] / 3 + 1;
                center[1] = 2;
                l_distance = Math.abs(left[0] - center[0]) + Math.abs(left[1] - center[1]);
                r_distance = Math.abs(right[0] - center[0]) + Math.abs(right[1] - center[1]);

                if (l_distance < r_distance) {
                    answer += "L";
                    left[0] = center[0];
                    left[1] = center[1];
                } else if (l_distance > r_distance) {
                    answer += "R";
                    right[0] = center[0];
                    right[1] = center[1];
                } else {
                    if(hand.equals("right")) {
                        answer += "R";
                        right[0] = center[0];
                        right[1] = center[1];
                    } else {
                        answer += "L";
                        left[0] = center[0];
                        left[1] = center[1];
                    }
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        int[] numbers1 = new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";

        int[] numbers2 = new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";

        int[] numbers3 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand3 = "right";

        solution(numbers1, hand1);
        solution(numbers2, hand2);
        solution(numbers3, hand3);
    }

}
