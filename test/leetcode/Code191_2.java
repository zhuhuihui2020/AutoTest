package leetcode;
//位1的个数
//循环检查二进制
public class Code191_2 {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            int tmp=n&1;
            if(tmp==1){
                count++;
            }
            n>>=1;
        }
        return count;
    }
}
