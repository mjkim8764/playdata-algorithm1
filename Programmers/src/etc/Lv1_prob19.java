package etc;

/*
    etc.Lv01_prob19 : 폰켓몬
    url : https://programmers.co.kr/learn/courses/30/lessons/1845

 */

import java.util.HashSet;

public class Lv1_prob19 {
    public static void solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i< nums.length; i++) {
            hashSet.add(nums[i]);
        }

        answer = hashSet.size() >= nums.length/2 ? nums.length/2 : hashSet.size();
        System.out.println(answer);

    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {3, 1, 2, 3};
        int[] nums2 = new int[] {3, 3, 3, 2, 2, 4};
        int[] nums3 = new int[] {3, 3, 3, 2, 2, 2};

        solution(nums1);
        solution(nums2);
        solution(nums3);
    }
}
