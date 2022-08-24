package leetcode;
//删除有序数组中的重复项 II
//不用count计数
public class Code80_3 {
    public static int removeDuplicates(int[] nums) {
        int length=nums.length;
        if(nums.length<=2){
            return length;
        }
        int slow=2;
        int fast=2;
        while (fast<length){
            if(nums[slow-2]!=nums[fast]){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1,1,2,2,2,3,4,4,4};
        System.out.println(removeDuplicates(nums));
        for (int i:nums){
            System.out.print(i+" ");
        }
    }
}
