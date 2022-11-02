package total.sort;
//冒泡排序第二版
/**
 * 经过优化的写法：使用一个变量记录当前轮次的比较是否发生过交换，如果没有发生交换表示已经有序，不再继续排序；
 */
public class BubbleSort2 {
    public static void bubbleSort(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=true;
                }
                count++;
            }
            if(!flag){
                System.out.println(count);
                return;
            }
        }

    }

    public static void swap(int[] arr,int a,int b){
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,8,6,4,21,10,23,24,25,26,27};
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
