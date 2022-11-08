package total.sort;
//插入排序

/**
 * 移动法，把内循环的for循环换成while循环
 */
public class InsertSort2_2 {
    public static void insertSort2(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int num=arr[i];
            int j=i;
            while (j>0&&num<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=num;
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,24,25,2,3,5,8,6,4,21,10,23,26,27};
        insertSort2(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
