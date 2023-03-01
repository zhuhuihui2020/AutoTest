package cyc2018.pai_xu;
//插入排序

/**
 * 类似打扑克：在打扑克牌时，我们一边抓牌一边给扑克牌排序，每次摸一张牌，就将它插入手上已有的牌中合适的位置，逐渐完成整个排序。
 * 交换法：在新数字插入过程中，不断与前面的数字交换，直到找到自己合适的位置。
 */

public class InsertSort_1 {
    public static void insertSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,10,10,11,3,4,5,6,8,7,9,10,13,12};
        insertSort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
