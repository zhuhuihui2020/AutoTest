package plan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个整数数组 nums 和一个整数 k 。
 *
 * 每一步操作中，你需要从数组中选出和为 k 的两个整数，并将它们移出数组。
 *
 * 返回你可以对数组执行的最大操作数。
 */
//超出时间限制
public class Code1679 {
        public static int maxOperations(int[] nums, int k) {
            Arrays.sort(nums);
            List<Integer> list=new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            boolean flag=true;
            int count=0;
            while (flag){
                flag=false;
                int left=0;
                int right=list.size()-1;
                while (left<right&&right-left>=1){
                    if((list.get(left)+list.get(right))==k){
                        flag=true;
                        count++;
                        list.remove(left);
                        //List调用remove(index)方法后，会移除index位置上的元素，之后的所有元素依次前移
                        list.remove(right-1);
                        break;
                    }else if(list.get(left)+list.get(right)<k){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
            return count;
        }

    public static void main(String[] args) {
        int[] arr=new int[]{3,1,3,4,3};
        System.out.println(maxOperations(arr,5));
    }
}
