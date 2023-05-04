package plan;

public class Code334 {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int small=Integer.MAX_VALUE;
        int mid=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=small){
                small=num;
            }else if(num<=mid){
                mid=num;
            }else if(num>mid){
                return true;
            }
        }
        return false;
    }
}
