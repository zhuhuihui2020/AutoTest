package total.sort;
//二元选择排序
/**
 * 二元选择排序，每轮选择时记录最小值和最大值，可以把数组需要遍历的范围缩小一倍
 */
public class SelectionSort2 {
    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            int maxIndex=arr.length-i-1;
            for(int j=i;j<arr.length-1-i;j++){
                if(arr[minIndex]>arr[j+1]){
                    minIndex=j+1;
                }
                if (arr[maxIndex] < arr[j+1]) {
                    maxIndex=j+1;
                }
            }
            swap(arr,i,minIndex);
            swap(arr,arr.length-i-1,maxIndex);
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
