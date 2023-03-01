package total.sort;
//选择排序
//每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完 。
/**
 * 双重循环遍历数组，每经过一轮比较，找到最小元素的下标，将其交换至首位。
 */
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i;j<arr.length-1;j++){
                if(arr[minIndex]>arr[j+1]){
                    minIndex=j+1;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    public static void swap(int[] arr,int x,int y){
        int tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,8,6,4,21,10,23,24,25,26,27};
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
