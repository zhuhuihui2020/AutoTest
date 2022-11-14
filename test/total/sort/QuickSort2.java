package total.sort;
//快速排序
public class QuickSort2 {
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        //取第一个数为基数
        int pivot=arr[left];
        int start=left+1;
        int end=right;
        while (start<end){
            //从右边找到第一个小于基数的数
            //这一步很重要，因为基数选择的是最左边的值，则要让最右边的指针先走，这样的话，可以保证，最后的start值所在位置的值一定比base小
            while (start<end&&arr[end]>pivot){
                end--;
            }
            //从左边找到第一个大于基数的数
            while (start<end&&arr[start]<pivot){
                start++;
            }
            //交换左右两边的数
            if(start<end){
                swap(arr,start,end);
            }
        }
        //将基数置换到轴的位置
        swap(arr,start,left);
        quickSort(arr,left,start-1);
        quickSort(arr,start+1,right);
    }

    public static void swap(int[] arr,int left,int right){
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
