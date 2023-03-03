package cyc2018.pai_xu;
//快速排序
/**
 *
 快速排序算法的基本思想是：
 从数组中取出一个数，称之为基数（pivot）
 遍历数组，将比基数大的数字放到它的右边，比基数小的数字放到它的左边。遍历完成后，数组被分成了左右两个区域
 将左右两个区域视为两个数组，重复前两个步骤，直到排序完成
 */
public class QuickSort {
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        //把数组的第一个数当作基数
        int pivot=arr[left];
        //记录一下原数组本次排序的首坐标
        int index=left;
        //把排好的数据放在新的数组里，最后要把新数组的数据复制到老数组里
        int[] newArr=new int[right-left+1];
        int start=0;
        int end=right-left;
        //中间基数在原数组的坐标值
        int middle=left;
        //从基数开始的第2个值开始和基数做比较，把小于等于基数的值放在新数组的左侧，把大于新数组的值放在新数组的右侧
        for(int i=left+1;i<=right;i++){
            if(arr[i]<=pivot){
                newArr[start++]=arr[i];
                //新数组左边放了一个数据，说明基数的值需要往右移动一位了（middle是原数组基数值应该在的下标）
                middle++;
            }else {
                newArr[end--]=arr[i];
            }
        }
        //把新数组的值复制给老数组
        for(int j=0;j<newArr.length;j++){
            arr[index++]=newArr[j];
        }
        //把基准值复制到原数组
        arr[middle]=pivot;
        quickSort(arr,middle+1,right);
        quickSort(arr,left,middle-1);
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,10,10,11,8,3,4,5,6,8,7,9,10,13,12};
//        int[] arr=new int[]{1,3,2};
        quickSort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }

}
