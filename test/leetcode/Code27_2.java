package leetcode;
//移除元素，双指针优化
public class Code27_2 {
    public static int removeElement(int[] nums, int val) {
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            System.out.println("000");
            if(nums[left]==val){
                nums[left]=nums[right];
                right--;
                System.out.println("111");
            }
            while (nums[left]!=val){
                System.out.println("left:"+left);
                System.out.println("right:"+right);
                if(left<right){
                    left++;
                    System.out.println("222");
                }else{
                    System.out.println("333");
                    break;
                }
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(removeElement(nums,val));
    }

}
