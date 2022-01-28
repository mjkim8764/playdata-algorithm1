package etc;

/*
    etc.Lv01_prob01 : 두 개 뽑아서 더하기
    url : https://programmers.co.kr/learn/courses/30/lessons/68644
 */

import java.util.ArrayList;

public class Lv1_prob02 {

    public static void solution(int[] numbers){
        ArrayList<Integer> result = new ArrayList<>();
        int n_length = numbers.length;

        for(int i=0; i<n_length-1; i++){
            for(int j=i+1; j<n_length; j++){
                if(!result.contains(numbers[i] + numbers[j])) {
                    result.add(numbers[i] + numbers[j]);
                }
            }
        }

        int[] answer = result.stream().mapToInt(v -> v).sorted().toArray();

        for(int i=0; i<answer.length; i++)
            System.out.print(answer[i] + " ");
        System.out.println();

    }

    public static void main(String[] args) {
        int[] numbers1 = new int[] {2, 1, 3, 4, 1};
        int[] numbers2 = new int[] {5, 0, 2, 7};

        solution(numbers1);
        solution(numbers2);
    }
}
