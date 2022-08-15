package leetcode;
//搜索插入位置
public class Code35 {
    public int searchInsert(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]>=target){
//                return i;
//            }
//            if(nums[nums.length-1]<target){
//                return nums.length-1;
//            }
//        }
//        return 0;

        //上面注释的方法的简化
//        如果数组中的值大于或者等于target，直接return
//        如果全部遍历完证明target是最大的数，直接插入末尾
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
