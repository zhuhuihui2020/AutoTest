package plan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Code2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        Set<Integer> hashSet1=new HashSet<>();
        Set<Integer> hashSet2=new HashSet<>();
        for(int num:nums1){
            hashSet1.add(num);
        }
        for(int num:nums2){
            hashSet2.add(num);
        }
        for(int num:nums1){
            if(!hashSet2.contains(num)&&!list1.contains(num)){
                list1.add(num);
            }
        }
        for(int num:nums2){
            if(!hashSet1.contains(num)&!list2.contains(num)){
                list2.add(num);
            }
        }
        list.add(list1);
        list.add(list2);
        return list;
    }
}
