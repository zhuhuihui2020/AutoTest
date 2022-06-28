package leetcode;
//插入排序
//移动法：在新数字插入过程中，与前面的数字不断比较，前面的数字不断向后挪出位置，当新数字找到自己的位置后，插入一次即可。
public class InsertSort2 {
    public static void insertSort(int[] arr) {
        //记录本次移动之后空出来的下标
//        int tmpIndex;
        //记录本次要插入的数据
        int tmpValue;
        for(int i=1;i<arr.length;i++){
//            tmpIndex=i;
            tmpValue=arr[i];
            int j=i-1;
            while (j>=0&tmpValue<arr[j]){
                arr[j+1]=arr[j];
//                tmpIndex=j-1;
                j--;
            }
            arr[j+1]=tmpValue;
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,7,5,8,6,4,21,10,23,24,25,26,27};
        insertSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
