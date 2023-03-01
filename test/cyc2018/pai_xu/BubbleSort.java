package cyc2018.pai_xu;
//冒泡排序
/**
 *  一边比较一边向后两两交换，将最大值 / 最小值冒泡到最后一位；
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
                count++;
            }
        }
        System.out.println("count"+count);
    }

    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,8,7,9,10,11,13,12};
        bubbleSort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
