package leetcode;

import java.util.HashMap;

//两数之和 II - 输入有序数组
//map
public class Code167_3 {
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] indexes=new int[2];
        for (int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                indexes[0]=map.get(target-numbers[i])+1;
                indexes[1]=i+1;
            }
            map.put(numbers[i],i);
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[] numbers=new int[]{2,7,11,15};
        int target=9;
        int[] indexs=twoSum(numbers,target);
        for (int index:
                indexs) {
            System.out.println(index);
        }
    }
}
