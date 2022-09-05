package leetcode;

import java.util.Arrays;

//丢失的数字
//先排序，再下标和数组对应位置的数做比较
public class Code268_2 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
