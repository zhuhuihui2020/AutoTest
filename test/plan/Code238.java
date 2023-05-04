package plan;

/**
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 *
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
 *
 * 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 */
public class Code238 {
    public int[] productExceptSelf(int[] nums) {
        int sum=1;
        //判断是否有0的数据，遇到0的数据+1
        int count=0;
        int length=nums.length;
        int[] answer=new int[length];
        for(int i=0;i<length;i++){
            if(nums[i]!=0){
                sum*=nums[i];
            }else {
                count++;
            }
        }
        for(int i=0;i<length;i++){
            if(count==0){
                answer[i]=sum/nums[i];
            }else if(count==1){
//                有一个0元素，那除了0元素本身所在的位置，其他的位置的元素都是0
                if(nums[i]!=0){
                    answer[i]=0;
                }else {
                    answer[i]=sum;
                }
            }else {
//                不止一个0，那说明所有的元素都是0
                answer[i]=0;
            }
        }
        return answer;
    }
}
