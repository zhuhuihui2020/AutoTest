package leetcode;
//两数之和 II - 输入有序数组
//双指针
public class Code167_2 {
    public static int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int[] indexes=new int[2];
        while (left<right){
            if(numbers[left]+numbers[right]==target){
                indexes[0]=left+1;
                indexes[1]=right+1;
                return indexes;
            }else if(numbers[left]+numbers[right]>target){
                right--;
            }else if(numbers[left]+numbers[right]<target){
                left++;
            }
        }
        return indexes;
    }
}
