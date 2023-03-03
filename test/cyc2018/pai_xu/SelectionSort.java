package cyc2018.pai_xu;
//选择排序
//每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完 。
public class SelectionSort {
    public static void selectionSort(int[] arr){
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

    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,10,10,11,8,3,4,5,6,8,7,9,10,13,12};
        selectionSort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
