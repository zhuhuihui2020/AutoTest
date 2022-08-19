package leetcode;
//颜色分类
//单指针
public class Code75_2 {
    public static void sortColors(int[] nums) {
        int left=0;
        int length=nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]==0){
                nums[i]=nums[left];
                nums[left++]=0;
            }
        }
        for(int i=left;i<length;i++){
            if(nums[i]==1){
                nums[i]=nums[left];
                nums[left++]=1;
            }
        }
    }
}
