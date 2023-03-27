package plan;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class Code35_2 {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        if(nums[right]<target){
            return right+1;
        }
        while (left<right){
            int middle=left+(right-left)/2;
            if(nums[middle]>=target){
                right=middle;
            }else{
                left=middle+1;
            }
        }
        return left;
    }
}
