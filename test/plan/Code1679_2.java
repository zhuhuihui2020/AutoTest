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

public class Code1679_2 {
        public static int maxOperations(int[] nums, int k) {
            Arrays.sort(nums);
            List<Integer> list=new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            boolean flag=true;
            int count=0;
            int left=0;
            int right=list.size()-1;
            while (left<right){
                if((list.get(left)+list.get(right))==k){
                    count++;
                    left++;
                    right--;
                }else if(list.get(left)+list.get(right)<k){
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
