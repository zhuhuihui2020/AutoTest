package cyc2018.shuang_zhi_zhen;

/**
 * 给你一个仅由整数组成的有序数组，其中每个元素都会出现两次，唯有一个数只会出现一次。
 *
 * 请你找出并返回只出现一次的那个数。
 *
 * 你设计的解决方案必须满足 O(log n) 时间复杂度和 O(1) 空间复杂度。
 */
//二分查找，时间复杂度logN
public class Code540_2 {
    public static int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(mid%2==1){
                mid--;//保证mid在偶数位置
            }
            if(nums[mid]==nums[mid+1]){
                //说明index肯定在mid的右边
                left=mid+2;
            }else {
                right=mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,1,3,3,4,4,8,8,9};
        System.out.println(singleNonDuplicate(arr));
    }
}
