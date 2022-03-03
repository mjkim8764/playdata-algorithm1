package etc;

/*
    etc.Lv02_prob22 : N개의 최소공배수
    url : https://programmers.co.kr/learn/courses/30/lessons/12953
 */

public class Lv2_prob22 {

    public static void solution(int[] arr) {
        int length = arr.length;
        int max;
        int min;
        int lcd = arr[0];

        for(int i=1; i<length; i++) {
            max = Math.max(lcd, arr[i]);
            min = Math.min(lcd, arr[i]);
            int gcd = makeGcd(max, min);
            lcd = (max * min) / gcd;
        }

        System.out.println(lcd);

    }

    public static int makeGcd(int a, int b) {
        // gcd(a, b) = gcd(b, a%b)
        int r;
        while(b != 1) {
            if(a % b == 0) {
                return b;
            } else {
                r = a % b;
                a = b;
                b = r;
            }

        }
        return b;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 6, 8, 14};
        int[] arr2 = new int[]{1, 2, 3};

        solution(arr1);
        solution(arr2);
    }
}
