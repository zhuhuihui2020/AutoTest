package plan;
//二分查找
public class Code704 {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int middle=left+(right-left)/2;
            if(nums[middle]==target){
                return middle;
            }else if(nums[middle]<target){
                left=middle+1;
            }else {
                right=middle-1;
            }
        }
        return -1;
    }
}
