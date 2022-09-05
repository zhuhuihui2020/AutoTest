package leetcode;
//丢失的数字
//位运算

/**
 * 根据出现的次数的奇偶性，可以使用按位异或运算得到丢失的数字。
 * 按位异或运算^满足交换律和结合律，且对任意整数 x 都满足 x ^ x = 0 和 x ^ 0 = x。
 */
public class Code268_4 {
    public int missingNumber(int[] nums) {
        int missingNum=0;
        for(int i=0;i<nums.length;i++){
            missingNum^=nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            missingNum^=i;
        }
        return missingNum;
    }
}
