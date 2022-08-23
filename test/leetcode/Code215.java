package leetcode;

import java.util.Arrays;
//数组中的第K个最大元素
public class Code215 {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums,4));
    }
}
