package leetcode;
//3 的幂
//判断是否为最大 333 的幂的约数
public class Code326_5 {
    public static boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        //1162261467是3的19次方，是int范围内最大的3的幂次方
        return 1162261467%n==0;
//        这一句就够了
//        return n>0&&1162261467%n==0;
    }

}
