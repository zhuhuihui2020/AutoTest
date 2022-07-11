package leetcode;
/**
 * 快速排序算法的基本思想是：
 *
 * 从数组中取出一个数，称之为基数（pivot），将每个分区的第一个数当作基数
 * 遍历数组，将比基数大的数字放到它的右边，比基数小的数字放到它的左边。遍历完成后，数组被分成了左右两个区域
 * 将左右两个区域视为两个数组，重复前两个步骤，直到排序完成
 */
public class QuickSort2 {
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left>right){
            return;
        }
        int base=partition(arr,left,right);
        if (left<right){
            quickSort(arr,left,base-1);
            quickSort(arr,base+1,right);
        }
    }

    //每个区间内比较，移动
    public static int partition(int[] arr,int left,int right){
        int base=left;
        int tmp=arr[left];
        while(left<right){
            while (left < right && arr[right]>=tmp) {
                right--;
            }
            while (left < right && arr[left]<=tmp) {
                left++;
            }
            if(left<right){
                swap(arr,left,right);
            }
        }
        swap(arr,base,left);
        return left;
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
