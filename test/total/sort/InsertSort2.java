package total.sort;
//插入排序

/**
 * 移动法：在新数字插入过程中，与前面的数字不断比较，前面的数字不断向后挪出位置，当新数字找到自己的位置后，插入一次即可。
 */
public class InsertSort2 {
    public static void insertSort2(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int num=arr[i];
            for(int j=i;j>0;j--){
                if(num<arr[j-1]){
                    arr[j]=arr[j-1];
                    continue;
                }
                arr[j]=num;
                break;
            }
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
