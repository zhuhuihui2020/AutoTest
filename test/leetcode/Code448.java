package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//找到所有数组中消失的数字
//暴力解法，超出时间限制
public class Code448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int length=nums.length;
        int n=1;
        while (n<=length){
            list.add(n);
            n++;
        }
        for(int i=0;i<length;i++){
            if(list.contains(nums[i])&&nums[i]<=length){
                list.remove((Integer) nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1};
        List<Integer> list=findDisappearedNumbers(nums);
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
