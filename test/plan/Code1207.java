package plan;

import java.util.*;

/**
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 *
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 */
public class Code1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        Iterator<Integer> iterator=map.keySet().iterator();
        Set<Integer> hashSet=new HashSet<>();
        while (iterator.hasNext()){
            if(!hashSet.add(map.get(iterator.next()))){
                return false;
            };
        }
        return true;
    }
}
