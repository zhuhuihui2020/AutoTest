package leetcode;

import java.util.Arrays;

//归并排序
public class MergeSort {
    public static void mergeSort(int[] arr,int left,int right){
        if(left==right){
            return;
        }
        int mid=(left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    public static void merge(int[]arr,int left,int mid,int right){
        int start1=left;
        int start2=mid+1;
        int[] tmp=new int[right-left+1];
        int i=0;
        while (start1<=mid&&start2<=right){
            if(arr[start1]<arr[start2]){
                tmp[i++]=arr[start1++];
            }else {
                tmp[i++]=arr[start2++];
            }
        }
        while (start1<=mid){
            tmp[i++]=arr[start1++];
        }
        while (start2<=right){
            tmp[i++]=arr[start2++];
        }
        for(int j=0;j<tmp.length;j++){
            arr[left++]=tmp[j];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,7,4,2,0,3,1,6};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
