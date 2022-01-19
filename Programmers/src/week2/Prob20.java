package week2;

/*
    Week2.Prob20 : 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고, 정렬 했을 때, k번째에 있는 수 구하기
    ex) array : [1, 5, 2, 6, 3, 7, 4]
        commands : [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
        return : [5, 6, 3]

        array를 2번째부터 5번째까지 자른 후 정렬. [2, 3, 5, 6]의 세 번째 숫자는 5
        array를 4번째부터 4번째까지 자른 후 정렬. [6]의 첫 번째 숫자는 6
        array를 1번째부터 7번째까지 자른 후 정렬. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3
 */

import java.util.ArrayList;

public class Prob20 {

    public static void solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];

        ArrayList<Integer> al = new ArrayList<>();

        for(int v : array){
            al.add(v);
        }

        for(int i=0; i<commands.length; i++) {
            answer[i] = al.stream().skip(commands[i][0] - 1).limit(commands[i][1] - commands[i][0] + 1).sorted().skip(commands[i][2] - 1).limit(1).mapToInt(v -> v).sum();
        }

        for(int i=0; i<answer.length; i++)
            System.out.print(answer[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        solution(array, commands);
    }
}