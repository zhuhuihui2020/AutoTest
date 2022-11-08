package total.sort;
//插入排序
/**
 * 交换法：在新数字插入过程中，不断与前面的数字交换，直到找到自己合适的位置。--类似打扑克
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr,int x,int y){
        int tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,24,25,2,3,5,8,6,4,21,10,23,26,27};
        insertSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
