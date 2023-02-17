package total.other;

import java.util.HashMap;

public class Code1_2 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] array=new int[2];
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                array[0]=map.get(target-nums[i]);
                array[1]=i;
            }
            map.put(nums[i],i);
        }
        return array;
    }
}
