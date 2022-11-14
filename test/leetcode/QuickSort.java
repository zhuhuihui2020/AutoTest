package leetcode;

//快速排序
//采用了分治思想
/**
 * 快速排序算法的基本思想是：
 *
 * 从数组中取出一个数，称之为基数（pivot），将每个分区的第一个数当作基数
 * 遍历数组，将比基数大的数字放到它的右边，比基数小的数字放到它的左边。遍历完成后，数组被分成了左右两个区域
 * 将左右两个区域视为两个数组，重复前两个步骤，直到排序完成
 */
public class QuickSort {

    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start>end) return;
        //把每个分区的第一个数当作基数
        int base=arr[start];
        int i=start;
        int j=end;
        while(i<j){
            //这一步很重要，因为基数选择的是最左边的值，则要让最右边的指针先走，这样的话，可以保证，最后的i值所在位置的值一定比base小
            while (i<j&&arr[j]>=base){
                j--;
            }
            while (i<j&&arr[i]<=base){
                i++;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,start,i);
        quickSort(arr,start,i-1);
        quickSort(arr,i+1,end);
    }

    public static void swap(int[] arr,int i,int j){
        int tmp;
        tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{6,1,2,7,9,3,4,5,10,8};
        quickSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
