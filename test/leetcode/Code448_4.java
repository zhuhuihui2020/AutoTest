package leetcode;

import java.util.ArrayList;
import java.util.List;
//找到所有数组中消失的数字
//将所有正数作为数组下标，置对应数组值为负值。那么，仍为正数的位置即为（未出现过）消失的数字
public class Code448_4 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums){
            int index=Math.abs(num)-1;
            nums[index]=-Math.abs(nums[index]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{4,3,2,7,6,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
