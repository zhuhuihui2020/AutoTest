package total.sort;
//冒泡排序第三版
/**
 * 除了使用变量记录当前轮次是否发生交换外，再使用一个变量记录上次发生交换的位置，下一轮排序时到达上次交换的位置就停止比较。
 */
public class BubbleSort3 {
    public static void bubbleSort(int[] arr) {
        int end=arr.length-1;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for(int j=0;j<end;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    end=j;
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
