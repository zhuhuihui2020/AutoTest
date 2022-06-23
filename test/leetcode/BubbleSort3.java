package leetcode;
//冒泡排序第三种，
public class BubbleSort3 {
    public static void bubbleSort(int[] arr){
        //循环次数计数
        int num=0;
        boolean flag=true;
        int lastIndex=arr.length-1;
        int tmpIndex=0;
        while(flag){
            flag=false;
            for (int j=0;j<lastIndex;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    tmpIndex=j+1;
                    flag=true;
                }
                num++;
            }
            lastIndex=tmpIndex;
        }
        //输出循环次数
        System.out.println("循环次数:"+num);
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
