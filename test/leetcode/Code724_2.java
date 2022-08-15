package leetcode;
//寻找数组的中心下标
public class Code724_2 {
    public static int pivotIndex(int[] nums){
        int sum=0;
        for (int num:nums) {
            sum+=num;
        }
        int j=0;
        int total=0;
        while (j<nums.length){
            if((total*2+nums[j])==sum){
                return j;
            }
            total+=nums[j];
            j++;
        }
        return -1;
    }
}
