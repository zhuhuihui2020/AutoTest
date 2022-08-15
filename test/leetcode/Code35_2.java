package leetcode;
//搜索插入位置
public class Code35_2 {
    public int searchInsert(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int middle=(left+right)/2;
            if (nums[middle]==target){
                return middle;
            }else if(nums[middle]>target){
                right=middle-1;
            }else if(nums[middle]<target){
                left=middle+1;
            }
        }
        return left;
    }
}
