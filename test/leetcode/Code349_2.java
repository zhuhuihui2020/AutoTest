package leetcode;

import java.util.Arrays;
import java.util.HashSet;

//两个数组的交集
//排序+双指针1
public class Code349_2 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set=new HashSet<>();
        while (i<len1&&j<len2){
            if(nums1[i]>nums2[j]){
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] arr=new int[set.size()];
        i=0;
        for(Integer a:set){
            arr[i++]=a;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] num1=new int[]{1,2,2,1};
        int[] num2=new int[]{2,2};
        int[] arr=intersection(num1,num2);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
