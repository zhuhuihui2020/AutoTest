package total.sort;
//归并排序

/**
 * 归并排序和快排的相同点：
 *
 * 1，利用分治思想
 * 2，具体实现都用递归
 *
 * 归并排序和快排的不同点：
 *
 * 1，先分解再合并：归并排序先递归分解到最小粒度，然后从小粒度开始合并排序，自下而上的合并排序；
 * 2，边分解边排序：快速排序每次分解都实现整体上有序，即参照值左侧的数都小于参照值，右侧的大于参照值；是自上而下的排序；
 * 3，归并排序不是原地排序，因为两个有序数组的合并一定需要额外的空间协助才能合并；
 * 4，快速排序是原地排序，原地排序指的是空间复杂度为O(1)；
 * 5，归并排序每次将数组一分为二，快排每次将数组一分为三
 */
public class MergeSort {
    public static void mergeSort(int[] arr){
        mergeSort(arr,0,arr.length-1);
    }

    public static void mergeSort(int[] arr,int start,int end){
        if(start==end){
            return;
        }
        int middle=(start+end)/2;
        mergeSort(arr,start,middle);
        mergeSort(arr,middle+1,end);
        merge(arr,start,middle,end);
    }

    public static void merge(int[] arr,int start,int middle,int end){
        int length=end-start+1;
        int start1=start;
        int start2=middle+1;
        int[] newArray=new int[length];
        int i=0;
        while (start1<=middle&&start2<=end){
            if(arr[start1]<arr[start2]){
                newArray[i++]=arr[start1++];
            }else{
                newArray[i++]=arr[start2++];
            }
        }
        while (start1<=middle){
            newArray[i++]=arr[start1++];
        }
        while (start2<=end){
            newArray[i++]=arr[start2++];
        }
        for(int j=0;j<length;j++){
            arr[start++]=newArray[j];
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{14,2,3,5,7,1,4,21,11,23,24,10,26,27};
        mergeSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
