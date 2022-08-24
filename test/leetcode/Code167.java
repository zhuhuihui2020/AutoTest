package leetcode;
//两数之和 II - 输入有序数组
//暴力解法
public class Code167 {
    public static int[] twoSum(int[] numbers, int target) {
        int length=numbers.length;
        int[] indexes=new int[2];
        for(int i=0;i<length-1;i++){
            int num=target-numbers[i];
            for(int j=i+1;j<length;j++){
                if(numbers[j]==num){
                    indexes[0]=i+1;
                    indexes[1]=j+1;
                    return indexes;
                }
                if(numbers[j]>num){
                    break;
                }
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[] numbers=new int[]{-1,0};
        int target=-1;
        int[] indexs=twoSum(numbers,target);
        for (int index:
             indexs) {
            System.out.println(index);
        }
    }
}
