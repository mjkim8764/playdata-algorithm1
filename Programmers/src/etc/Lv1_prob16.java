package etc;

/*
    etc.Lv01_prob16 : 소수 만들기
    url : https://programmers.co.kr/learn/courses/30/lessons/12977
 */

public class Lv1_prob16 {
    public static void solution(int[] nums) {
        int answer = 0;
        int length = nums.length;

        for(int i=0; i<length-2; i++) {
            for(int j=i+1; j<length-1; j++) {
                for(int k=j+1; k<length; k++) {
                    if(primeCheck(nums[i] + nums[j] + nums[k]))
                        answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public static boolean primeCheck(int sum) {
        int count = 0;
        for(int i=2; i<=(int)(Math.sqrt(sum)); i++) {
            if(sum % i == 0 )
                count++;
        }
        return count == 0;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2, 3, 4};
        int[] nums2 = new int[] {1, 2, 7, 6, 4};

        solution(nums1);
        solution(nums2);
    }
}
