package leetcode;

import java.util.HashMap;

//多数元素
public class Code169 {
    public static int majorityElement(int[] nums) {
        int length=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int key:map.keySet()){
            if(map.get(key)>length/2){
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
