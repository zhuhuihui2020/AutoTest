package plan;

/**
 * 给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。
 *
 * 请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。
 *
 * 任何误差小于 10-5 的答案都将被视为正确答案。
 */
public class Code643 {
    public static double findMaxAverage(int[] nums, int k) {
        double result=-Double.MAX_VALUE;
        int left=0;
        int right=k-1;
        int sum=0;
        for(int i=0;i<=right;i++){
            sum+=nums[i];
        }
        while (right<nums.length){
            double d=(double) sum/k;
            if(d>result){
                result=d;
            }
            left++;
            right++;
            if(right<nums.length) {
                sum = sum + nums[right] - nums[left-1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,12,-5,-6,50,3};
//        int[] arr=new int[]{-1};
        System.out.println(findMaxAverage(arr,4));
    }
}
