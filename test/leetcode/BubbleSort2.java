package leetcode;
//冒泡排序--第二种写法，优点：如果一轮比较中没有发生过交换，则立即停止排序，因为此时剩余数字一定已经有序了
public class BubbleSort2 {
    public static void bubbleSort(int[] arr){
        //循环次数计数
        int num=0;
        int count;
        for(int i=0;i<arr.length;i++){
            count=0;
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    count=count+1;
                }
                num++;
            }
            if(count==0){
                //输出循环次数
                System.out.println("循环次数:"+num);
                return;
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tmp;
        tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,8,6,4,21,10,23,24,25,26,27};
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
