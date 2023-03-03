package cyc2018.pai_xu;
//二元选择排序
/**
 * 二元选择排序，每轮选择时记录最小值和最大值，可以把数组需要遍历的范围缩小一倍
 */
public class SelectionSort2 {
    public static void selectionSort(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int minIndex=left;
            int maxIndex=right;
            for(int j=left;j<=right;j++){
                if(arr[minIndex]>=arr[j]){
                    minIndex=j;
                }
                if(arr[maxIndex]<arr[j]){
                    maxIndex=j;
                }
            }
            swap(arr,left,minIndex);
            if(maxIndex==left){
                maxIndex=minIndex;
            }
            swap(arr,right,maxIndex);
            left++;
            right--;
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
