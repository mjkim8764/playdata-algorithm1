/*
    Prob11 : 행렬의 덧셈
    행과 열의 크기가 같은 두 행렬 arr1, arr2 입력받아 행렬 덧셈의 결과를 출력
 */

public class Prob11 {
    public static void main(String[] args) {
        int[][] arr1 = { {1,2}, {2,3} };
        int[][] arr2 = { {3,4}, {5,6} };

        for(int i=0; i<arr1.length; i++)
            for(int j=0; j<arr1[i].length; j++)
                arr1[i][j] += arr2[i][j];

        for(int i=0; i<arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++)
                System.out.print(arr1[i][j] + " ");
            System.out.println();
        }
    }
}