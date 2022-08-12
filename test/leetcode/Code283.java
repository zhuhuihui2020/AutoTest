package leetcode;
//移动零
public class Code283 {
    public static void moveZeroes(int[] nums) {
        int left=0;
        int right=0;
        int tmp;
        while (right<nums.length){
            if (nums[right]!=0) {
                tmp=nums[left];
                nums[left]=nums[right];
                nums[right]=tmp;
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{0,0,0,2,3,5};
        moveZeroes(nums);
        for(int num:nums){
            System.out.println(num);
        }
    }
}
