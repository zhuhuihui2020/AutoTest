package leetcode;
//两数之和 II - 输入有序数组
//二分查找
public class Code167_4 {
    public static int[] twoSum(int[] numbers, int target) {
        int length=numbers.length;
        for(int i=0;i<length;i++){
            int left=i+1;
            int right=numbers.length-1;
            int num=target-numbers[i];
            while (left<=right){
                int mid=(left+right)/2;
                if(numbers[mid]==num){
                    return new int[]{i + 1, mid + 1};
                }else if(numbers[mid]>num){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers=new int[]{2,3,4};
        int target=6;
        int[] indexs=twoSum(numbers,target);
        for (int index:
                indexs) {
            System.out.println(index);
        }
    }
}
