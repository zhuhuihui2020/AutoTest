package leetcode;

public class Code724_3 {
    public static int pivotIndex(int[] nums){
        int left=0;
        int right=nums.length-1;
        int sumLeft=0;
        int sumRight;
        while (right-left>1){
            sumLeft+=nums[left];
            sumRight=nums[right];
            if (right-left>1&&sumLeft<sumRight){
                left++;
            }
            if(right-left>1&&sumLeft>sumRight){
                right++;
            }
        }
        return 0;
    }
}
