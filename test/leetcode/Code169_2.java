package leetcode;
//多数元素
//摩尔投票法
public class Code169_2 {
    public static int majorityElement(int[] nums) {
        int cand_num=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                cand_num=nums[i];
            }
            if(cand_num==nums[i]){
                count++;
            }else {
                count--;
            }
        }
        return cand_num;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2};
        System.out.println(majorityElement(nums));
    }
}
