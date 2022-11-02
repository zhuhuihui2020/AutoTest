package total.sort;
//冒泡排序第一版

/**
 * 一边比较一边向后两两交换，将最大值 / 最小值冒泡到最后一位；
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
                }
                count++;
            }
        }
        System.out.println(count);
    }

    public static void swap(int[] arr,int a,int b){
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,13,5,8,6,4,21,10,23,24,25,26,27};
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
