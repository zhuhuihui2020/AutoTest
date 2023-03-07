package cyc2018.pai_xu;
//归并排序
//合并两个有序数组
public class MergeSort {
    public static void mergeSort(int[] arr){
        mergeSort(arr,0,arr.length-1);
    }

    public static void mergeSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int mid=(left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1 , right);
        //创建一个新数组，将两个数组合并进新数组里，最后再赋值给原数组
        int[] newArr=new int[right-left+1];
        int index=0;
        int start1=left;
        int middle=(left+right)/2;
        int start2=middle+1;
        while (start1<=middle||start2<=right){
            if (start1<=middle&&start2<=right){
                if(arr[start1]<=arr[start2]){
                    newArr[index++]=arr[start1++];
                }else {
                    newArr[index++]=arr[start2++];
                }
            }else if(start1<=middle&&start2>right){
                while (start1<=middle){
                    newArr[index++]=arr[start1++];
                }
            }else if(start1>middle&&start2<=right){
                while (start2<=right){
                    newArr[index++]=arr[start2++];
                }
            }
        }
        int begin=left;
        for(int a:newArr){
            arr[begin++]=a;
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{14,2,3,5,7,1,4,21,11,23,24,10,26,27};
//        int[] arr=new int[]{1,3,2,0};
        mergeSort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
