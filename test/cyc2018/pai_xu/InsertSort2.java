package cyc2018.pai_xu;
//插入排序

/**
 * 类似打扑克：在打扑克牌时，我们一边抓牌一边给扑克牌排序，每次摸一张牌，就将它插入手上已有的牌中合适的位置，逐渐完成整个排序。
 * 移动法：在新数字插入过程中，与前面的数字不断比较，前面的数字不断向后挪出位置，当新数字找到自己的位置后，插入一次即可。
 */
public class InsertSort2 {
    public static void insertSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int j=i;
            int num=arr[j];
            while (arr[j-1]>num&&j>0){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=num;
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,10,10,11,3,4,5,6,8,7,9,10,13,12};
        insertSort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
