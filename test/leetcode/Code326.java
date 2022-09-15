package leetcode;
//3 的幂
//暴力解法，超出时间限制
public class Code326 {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        int tmp=1;
        while (tmp<n){
            tmp*=3;
            if(tmp==n){
                return true;
            }else if(tmp>n){
                return false;
            }

        }
        return false;
    }
}
