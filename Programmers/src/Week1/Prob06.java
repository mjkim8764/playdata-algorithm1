package Week1;

/*
    Week1.Prob06 : 배열 arr가 주어지고 각 원소는 0부터 9까지 이루어져 있음
             이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거
             남은 값을 반환할때는 순서를 유지한다
             ex1) [1,1,3,3,0,1,1] : [1,3,0,1]
             ex2) [4,4,4,3,3] : [4,3]
 */

import java.util.ArrayList;

public class Prob06 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        ArrayList<Integer> al = new ArrayList<>();

        //Initialize : al 의 첫 번째 값에 arr[0]을 넣어준다
        //ArrayList의 크기 <= 0 일 때, get(int) 메소드를 호출하면 Exception을 던지기 때문
        int index = 0;
        al.add(arr[0]);

        for(int i=1; i<arr.length; i++){
            if(!(al.get(index) == arr[i])) {
                al.add(arr[i]);
                index++;
            }
        }

        //answer는 int[]로 고정이기 때문에 필요한 만큼만의 크기를 생성해야 한다.
        int[] answer = new int[al.size()];

        for(int i=0; i<al.size(); i++) {
            answer[i] = al.get(i);
        }

        for(int i=0; i<al.size(); i++){
            System.out.println(answer[i]);
        }
    }
}