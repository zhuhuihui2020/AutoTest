package leetcode;
//最大连续1的个数
public class Code485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0;
        int count=0;
        for(int num:nums){
            if(num==1){
                count++;
                if(count>maxCount){
                    maxCount=count;
                }
            }else{
                count=0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1,0,1,1,1,1,0,1,0,0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
