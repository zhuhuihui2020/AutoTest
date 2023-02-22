package cyc2018.shuang_zhi_zhen;

/**
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 *
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 *
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 */
public class Code69 {
    public static int mySqrt(int x) {
        int left=0      ;
        int right=x;
        while (left<=right){
            int middle=left+(right-left)/2;
            int sqrt=x/middle;
            if(sqrt==middle){
                return middle;
            }else if(sqrt<middle){
                right=middle-1;
            }else {
                left=middle+1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
