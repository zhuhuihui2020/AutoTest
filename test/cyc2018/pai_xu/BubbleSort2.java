package cyc2018.pai_xu;
//冒泡排序
/**
 * 经过优化的写法：使用一个变量记录当前轮次的比较是否发生过交换，如果没有发生交换表示已经有序，不再继续排序；
 */
public class BubbleSort2 {
    public static void bubbleSort(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    swap(arr,j,j+1);
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
