package leetcode;
//3 的幂
//试除法
public class Code326_4 {
    public static boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        while (n%3==0){
            n/=3;
        }
        return n==1;
    }
}
