package week2;

/*
    Week2.Prob30 : 비밀지도
    url : https://programmers.co.kr/learn/courses/30/lessons/17681

    Refactoring : 앞 공백, 뒷 공백 작업하는 부분을
                  String 클래스의 format 메소드를 이용하면 코드 다이어트가 가능하다. (속도 측에선 조금 의문일지도)

                  answer[i] = String.format("%" + n + "s", answer[i]);

 */

public class Prob30 {

    public static void solution(int n, int[] arr1, int[] arr2){
        String[] answer = new String[n];
        String space;

        for(int i=0; i<n; i++){
            answer[i] = "" + Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = answer[i].replace('1', '#').replace('0', ' ');

            // 앞 공백
            space = "";
            for(int j=0; j<n-answer[i].length(); j++) {
                space += " ";
            }
            answer[i] = space + answer[i];

            // 뒷 공백
            for(int j=answer[i].length(); j<n; j++) {
                answer[i] += " ";
            }

            System.out.println(answer[i]);
        }
    }

    public static void main(String[] args) {
        int n1 = 5;
        int[] arr1_1 = new int[] {9, 20, 28, 18, 11};
        int[] arr2_1 = new int[] {30, 1, 21, 17, 28};

        int n2 = 6;
        int[] arr1_2 = new int[] {46, 33, 33, 22, 31, 50};
        int[] arr2_2 = new int[] {27, 56, 19, 14, 14, 10};

        solution(n1, arr1_1, arr2_1);
        solution(n2, arr1_2, arr2_2);
    }
}