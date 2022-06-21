package leetcode;
//冒泡排序-第一种写法
public class CodeTest {
    public static void bubbleSort(int[] arr){
        int t=0;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
            t++;
        }
        System.out.println("t:"+t);
    }

    public static void swap(int[] arr,int i,int j){
        int tmp;
        tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,8,6,4,21,10};
        bubbleSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
