package plan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Code2215_2 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();
        Set<Integer> hashSet1=new HashSet<>();
        Set<Integer> hashSet2=new HashSet<>();
        for(int num:nums1){
            hashSet1.add(num);
        }
        for(int num:nums2){
            hashSet2.add(num);
            if(hashSet1.contains(num)){
                hashSet1.remove(num);
            }
        }
        for(int num:nums1){
            if(hashSet2.contains(num)){
                hashSet2.remove(num);
            }
        }
        list.add(new ArrayList<>(hashSet1));
        list.add(new ArrayList<>(hashSet2));
        return list;
    }
}
