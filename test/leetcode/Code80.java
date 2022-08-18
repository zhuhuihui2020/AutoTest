package leetcode;

import java.util.HashMap;
import java.util.Map;

//删除有序数组中的重复项 II
public class Code80 {
    public static int removeDuplicates(int[] nums) {
        //key存放数组元素，vale存放元素出现的次数
        HashMap<Integer,Integer> map=new HashMap<>();
        //慢指针从0开始赋值数组元素
        int slow=0;
        Integer value;
        for(int i=0;i<nums.length;i++){
            value=map.get(nums[i]);
            if(value==null||value==1){
                int count=(value==null)?0:1;
                map.put(nums[i],count+1);
                nums[slow]=nums[i];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1,1,2,2,3,4,4,4};
        System.out.println(removeDuplicates(nums));
        for (int i:nums){
            System.out.print(i+" ");
        }
    }
}
