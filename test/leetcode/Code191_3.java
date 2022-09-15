package leetcode;
//位1的个数
//循环检查二进制
public class Code191_3 {
    public static int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            if((n&(1<<i))!=0){
                count++;
            }
        }
        return count;
    }
}
