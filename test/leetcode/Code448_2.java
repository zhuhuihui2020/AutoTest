package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//找到所有数组中消失的数字
public class Code448_2 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> hashSet=new HashSet<>();
        for(int num:nums){
            hashSet.add(num);
        }
        for(int i=1;i<=nums.length;i++){
            if(!hashSet.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
