package leetcode;

//丢失的数字
//数学方法：高中等差数列求和知识：“首项加尾项乘以项数除以二”。
public class Code268_3 {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int totalSum=nums.length*(nums.length+1)/2;
        return totalSum-sum;
    }
}
