package plan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个整数数组 nums 和一个整数 k 。
 *
 * 每一步操作中，你需要从数组中选出和为 k 的两个整数，并将它们移出数组。
 *
 * 返回你可以对数组执行的最大操作数。
 */
//不需要用list装一下了，因为也不真的移除
public class Code1679_3 {
        public static int maxOperations(int[] nums, int k) {
            Arrays.sort(nums);
            int count=0;
            int left=0;
            int right=nums.length-1;
            while (left<right){
                if((nums[left]+nums[right])==k){
                    count++;
                    left++;
                    right--;
                }else if((nums[left]+nums[right])<k){
                    left++;
                }else {
                    right--;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        int[] arr=new int[]{3,1,3,4,3};
        System.out.println(maxOperations(arr,5));
    }
}
