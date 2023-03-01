package cyc2018.pai_xu;
//冒泡排序
/**
 除了使用变量记录当前轮次是否发生交换外，再使用一个变量记录上次发生交换的位置，下一轮排序时到达上次交换的位置就停止比较。
 */
public class BubbleSort3 {
    public static void bubbleSort(int[] arr) {
        int count=0;
        int end=arr.length;
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for (int j=i+1;j<end;j++){
                if(arr[j-1]>arr[j]){
                    flag=true;
                    end=j;
                    swap(arr,j-1,j);
                }
                count++;
            }
            if(flag==false){
                System.out.println("count:"+count);
                return;
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,8,7,9,10,10,10,11,13,12};
        bubbleSort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
