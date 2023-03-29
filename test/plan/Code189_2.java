package plan;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
// 数组长度为7，下标是6，k=3
// 0-->3
// 6-->2
// 5-->1
public class Code189_2 {
    public void rotate(int[] nums, int k) {
        int[] newArr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            newArr[(i+k)%nums.length]=nums[i];
        }
//        for (int i=0;i<nums.length;i++){
//            nums[i]=newArr[i];
//        }
        System.arraycopy(newArr,0,nums,0,nums.length);
    }
}
