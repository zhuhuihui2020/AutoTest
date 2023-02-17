package cyc2018.shuang_zhi_zhen;

/**
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
 */
//双指针
public class Code633_2 {
    public boolean judgeSquareSum(int c) {
        int a=0;
        int b=(int)Math.sqrt(c);//我居然没想起来先求个平方根！！！
        while (a<=b){
            int sum=(int)(Math.pow(a,2)+Math.pow(b,2));
            if(sum==c){
                return true;
            }else if(sum<c){
                a++;
            }else {
                b--;
            }
        }
        return false;
    }
}
