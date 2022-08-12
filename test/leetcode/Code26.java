package leetcode;
//删除排序数组中的重复项
public class Code26 {
    public static int removeDuplicates(int[] nums) {
        int left=0;
        int right=1;
        while (right<nums.length){
            if(nums[right-1]!=nums[right]){
                left++;
                nums[left]=nums[right];
            }
            right++;
        }
        return left+1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1,2,2};
        System.out.println(removeDuplicates(nums));
    }
}
