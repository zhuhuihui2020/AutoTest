package plan;

/**
 * 给你一个二进制数组 nums ，你需要从中删掉一个元素。
 *
 * 请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。
 *
 * 如果不存在这样的子数组，请返回 0 。
 */
//其实就是把1004中的k换成1，最后的结果减1就行了
public class Code1493 {
    public int longestSubarray(int[] nums) {
        int length=nums.length;
        int left=0;
        int right=0;
        int count=0;
        int maxRes =0;
        while (count < 1&&right<length) {
            if (nums[right] == 0) {
                count++;
            }
            maxRes=right - left + 1;
            right++;
        }
        while (right<length){
            if(nums[right]==0){
                //当nums[right]遇到0了，说明left需要移动了
                while (nums[left]!=0){
                    left++;
                }
                left++;
            }
            maxRes=Math.max(maxRes,right-left+1);
            right++;
        }
        return maxRes-1;
    }
}
