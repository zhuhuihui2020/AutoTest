package leetcode;

import java.util.ArrayList;
import java.util.List;
//找到所有数组中消失的数字
//官方-原地修改，用让nums数组充当哈希表
public class Code448_3 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int num:nums){
            int index=(num-1)%n;//通过nums[i]算出来应该给哪个下标的数据+n; num%n-1会报错，因为n在数组中时，求出来的index=-1；
            nums[index]+=n;//可能会在同一个下标下重复加
        }
        for(int i=0;i<n;i++){
            if(nums[i]<=n){
                list.add(i+1);//下标是从0开始的，所以需要+1
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
