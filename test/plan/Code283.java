package plan;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class Code283{
    public static void moveZeroes(int[] nums) {
        int left=0;
        int right=0;
        int length=nums.length;
        while (right<length){
            //找到为0的数组下标
            while (left<length&&nums[left]!=0){
                left++;
            }
            //在为0的下标的基础上，往后找到不为0的下标
            right=left+1;
            while (right<length&&nums[right]==0){
                right++;
            }
            if(left<length&&right<length) {
//                nums[left] = nums[right];
                swap(nums,left,right);
                left++;
            }
        }
        for (int i = left + 1; i < length; i++) {
            nums[i] = 0;
        }
    }

    public static void swap(int[] arr,int left,int right){
        int tmp=arr[left];
        arr[left]=arr[right];
        arr[right]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{0,1,0,3,12};
        moveZeroes(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
