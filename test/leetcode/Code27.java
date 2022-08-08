package leetcode;
//移除元素
public class Code27 {
    public static int removeElement(int[] nums, int val) {
        int left=0;
        int right=0;
        while(right<nums.length){
            if(nums[right]!=val){
                nums[left]=nums[right];
                left++;
            }
            right++;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(removeElement(nums,val));
    }
}
