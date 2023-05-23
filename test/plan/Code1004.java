package plan;

/**
 * 给定一个二进制数组 nums 和一个整数 k，如果可以翻转最多 k 个 0 ，则返回 数组中连续 1 的最大个数 。
 */
public class Code1004 {
    public static int longestOnes(int[] nums, int k) {
        int length=nums.length;
        int left=0;
        int right=0;
        int count=0;
        int maxRes =0;
        while (count < k&&right<length) {
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
        return maxRes;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{0,1};
        int k=2;
        System.out.println(longestOnes(arr,k));
    }

}
