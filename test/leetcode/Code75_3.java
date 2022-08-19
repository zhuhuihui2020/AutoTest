package leetcode;
//颜色分类
//双指针
public class Code75_3 {
    public static void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int length=nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]==0){
                nums[i]=nums[left];
                nums[left++]=0;
            }else if(nums[i]==2){
                nums[i]=nums[right];
                nums[right--]=2;
                length--;
                //少了这个判断，所以有问题,和2交换的如果不是1的话，指针需要回退，因为不是1就是0，0还需要往前挪动
                if(nums[i]!=1){
                    i--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,0};
        sortColors(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
