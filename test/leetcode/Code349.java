package leetcode;

import java.util.HashSet;

//两个数组的交集
//利用set集合
public class Code349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for (int num:nums1){
            set.add(num);
        }
        HashSet<Integer> set2=new HashSet<>();
        for (int num:nums2){
            if(set.contains(num)){
                set2.add(num);
            }
        }
        int[] arr=new int[set2.size()];
        int i=0;
        for(Integer a:set2){
            arr[i++]=a;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] num1=new int[]{4,9,5};
        int[] num2=new int[]{9,4,9,8,4};
        int[] arr=intersection(num1,num2);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
