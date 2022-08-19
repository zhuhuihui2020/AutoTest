package leetcode;
//颜色分类
//选择排序，效率很低
public class Code75 {
    public static void sortColors(int[] nums) {
        int minIndex;
        for(int i=0;i<nums.length-1;i++){
            minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }
            int tmp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=tmp;
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,0,2,1,1,0};
        sortColors(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
