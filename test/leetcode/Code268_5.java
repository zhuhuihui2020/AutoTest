package leetcode;

//丢失的数字
//原地哈希

/**
 * 事实上，我们可以将 numsnums 本身作为哈希表进行使用，
 * 将 nums[i]nums[i] 放到其应该出现的位置（下标）nums[i] 上（ nums[i] < n ），
 * 然后对 nums 进行检查，找到满足 nums[i] 不等于 inums[i]的位置即是答案，
 * 如果不存在 nums[i] 不等于 inums[i]的位置，
 * 则 n为答案。
 */
public class Code268_5 {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=i&&nums[i]<n){
                swap(nums,i,nums[i]);
                i--;
            }
        }
        for(int i=0;i<n;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return n;
    }

    public static void swap(int[] nums,int n,int m){
        int tmp=nums[n];
        nums[n]=nums[m];
        nums[m]=tmp;
    }
}
