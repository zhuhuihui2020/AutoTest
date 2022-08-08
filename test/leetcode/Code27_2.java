package leetcode;
//移除元素，双指针优化
public class Code27_2 {
    public static int removeElement(int[] nums, int val) {
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            if(nums[left]==val){
                nums[left]=nums[right];
                right--;
            }else {
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,2,2,3};
        int val=3;
        System.out.println(removeElement(nums,val));
    }

}
