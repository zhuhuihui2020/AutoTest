package total.sort;
//快速排序
/**
 * 从数组中取出一个数，称之为基数（pivot）
 * 遍历数组，将比基数大的数字放到它的右边，比基数小的数字放到它的左边。遍历完成后，数组被分成了左右两个区域
 * 将左右两个区域视为两个数组，重复前两个步骤，直到排序完成
 */

/**
 * 空间复杂度不是o(1)，在排序的过程中，创建了一个临时数组，不是原地排序的
 */
public class QuickSort {
    //快速排序的架子
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int middle=partition(arr,left,right);
        quickSort(arr,left,middle-1);
        quickSort(arr,middle+1,right);
    }

    public static int partition(int[] arr,int left,int right){
        //取第一个数为基数
        int pivot=arr[left];
        int[] tmp=new int[right-left+1];
        int i=0;
        int j=right-left;
        for(int start=left+1;start<=right;start++){
            if(arr[start]<pivot){
                tmp[i++]=arr[start];
            }else if(arr[start]>=pivot){
                tmp[j--]=arr[start];
            }
        }
        tmp[i]=pivot;
        int k=0;
        for(int m=left;m<right+1;m++){
            arr[m]=tmp[k++];
        }
        return left+i;
    }

    public void swap(int[] arr,int left,int right){
        int tmp=arr[left];
        arr[left]=arr[right];
        arr[right]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{14,2,3,5,7,3,4,21,10,23,24,10,26,27};
        quickSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
