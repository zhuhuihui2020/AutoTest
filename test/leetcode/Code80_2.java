package leetcode;

public class Code80_2 {
    public static int removeDuplicates(int[] nums) {
        int count=1;
        int slow=1;
        int value=nums[0];
        for (int i=1;i<nums.length;i++){
            System.out.println("count:"+count);
            if(nums[i]!=value){
                value=nums[i];
                count=1;
            }else {
                count++;
            }
            if(count>2){
                continue;
            }
            nums[slow]=nums[i];
            slow++;
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
