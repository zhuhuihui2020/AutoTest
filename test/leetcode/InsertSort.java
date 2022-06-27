package leetcode;

//插入排序
//交换法：在新数字插入过程中，不断与前面的数字交换，直到找到自己合适的位置。
public class InsertSort {
    public static void insertSort(int[] arr){
        //从第二个数开始插入
        for(int i=1;i<arr.length;i++){
            //本次比较的初始下标
            int j=i;
            //如果插入的数比前一个数小，就与前一个数交换
            while(j>=1&arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                //下标前移，继续向前比较
                j--;
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tmp;
        tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,8,6,4,21,10,23,24,25,26,27};
        insertSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
