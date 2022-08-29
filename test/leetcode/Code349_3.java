package leetcode;

import java.util.Arrays;
import java.util.HashSet;

//两个数组的交集
//排序+双指针2
public class Code349_3 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] arr=new int[len1+len2];
        int index=0;
        while (i<len1&&j<len2){
            if(nums1[i]>nums2[j]){
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]==nums2[j]){
                if(index==0||nums1[i]!=arr[index-1]){
                    arr[index++]=nums1[i];
                }
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(arr,0,index);
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
