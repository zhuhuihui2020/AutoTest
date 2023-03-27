package plan;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
public class Code977 {
    public int[] sortedSquares(int[] nums) {
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if (nums[i]>=0){
                right=i;
                break;
            }
        }
        int left=right-1;
        int[] newArr=new int[nums.length];
        int index=0;
        while (left>=0||right<nums.length){
            if(left>=0&&right<nums.length){
                if(nums[left]*nums[left]<=nums[right]*nums[right]){
                    newArr[index++]=nums[left]*nums[left];
                    left--;
                }else{
                    newArr[index++]=nums[right]*nums[right];
                    right++;
                }
            }else if(left<0){
                newArr[index++]=nums[right]*nums[right];
                right++;
            }else if(right>=nums.length){
                newArr[index++]=nums[left]*nums[left];
                left--;
            }
        }
        return newArr;
    }
}
