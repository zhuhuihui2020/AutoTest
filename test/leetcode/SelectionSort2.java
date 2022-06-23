package leetcode;

//二元选择排序：每轮选择时记录最小值和最大值，可以把数组需要遍历的范围缩小一倍
public class SelectionSort2 {
    public static void selectionSort(int[] arr){
        int maxIndex;
        int minIndex;
        //
        int count=0;
        for(int i=0;i<arr.length/2;i++){
            minIndex=i;
            maxIndex=i;
            for(int j=i+1;j<arr.length-i;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
                if(arr[maxIndex]<arr[j]){
                    maxIndex=j;
                }
                count++;
            }
            //注意：如果最大值的下标和最小值的下标一样，说明剩下没排的数都一样大，就不用换了
            if(maxIndex==minIndex){
                break;
            }
            //把最小值换到首位
            swap(arr,minIndex,i);
            //特殊情况处理：如果最大值的下标等于i，又因为arr[i]是本次遍历的首位，已经和arr[minIndex]交换了，
            // 所以最大值的下标要跟踪到arr[i]最新的下标minIndex
            if(maxIndex==i){
                maxIndex=minIndex;
            }
            //把最大值换到尾位
            swap(arr,maxIndex,arr.length-i-1);
        }
        System.out.println("count："+count);
    }

    public static void swap(int[] arr,int i,int j){
        int tmp;
        tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,8,6,4,21,10,23,24,25,26,27};
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
