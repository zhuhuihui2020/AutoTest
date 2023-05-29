package plan;

public class Code724_2 {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int length=nums.length;
        for(int i=0;i<length;i++){
            sum+=nums[i];
        }
        int total=0;
        for(int i=0;i<nums.length;i++){
            if(total*2+nums[i]==sum){
                return i;
            }
            total+=nums[i];
        }
        return -1;
    }
}
