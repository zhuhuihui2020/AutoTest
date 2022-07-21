package leetcode;

public class Code724 {
    public static int pivotIndex(int[] nums) {
        int sumLeft=0;
        int sumRight=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            int right=nums.length-1;
            while (i!=0&&left<=i-1){
                sumLeft+=nums[left];
                left++;
            }
            while (i!=nums.length-1&&right>=i+1){
                sumRight+=nums[right];
                right--;
            }
            if(i==0&&sumRight==0){
                return i;
            }
            if(sumLeft==sumRight){
                return i;
            }
            if(i==nums.length-1&&sumLeft==0){
                return i;
            }
            sumRight=0;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2, 1, -1};
        System.out.println(pivotIndex(nums));
    }
}
