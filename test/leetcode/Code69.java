package leetcode;
//x的平方根

/**
 * int变量中，第一位是符号位(0表示正数，1表示负数)。
 * int型能表示的最大正数
 * int型的32bit位中，第一位是符号为，正数位0。
 * 因此，int型能表示的最大的正数的二进制码是0111 1111 1111 1111 1111 1111 1111 1111，也就是2^31-1。
 * 值为：2147483647
 *
 * int类型，4个字节，32位，但取值范围为什么是-2^ 31到2^ 31-1呢？是因为有一位符号位的存在。
 * int超过正向的范围之后，之所以会变成负数，
 * 就是因为，正数的符号位，也就是最高位是0，
 * 当正数超过最大值时，再向前进一位，最高位由0变成了1，所以就由正数变成负数。
 */
public class Code69 {
    public static int mySqrt(int x) {
        //如果用int的话超过正向的范围之后，会变成负数
        long left=0;
        long right=x;
        long mid=0;
        while(mid>=0){
            mid=(left+right)/2;
            if(mid*mid>x){
                right=mid;
            }else if(mid*mid<x){
                if((mid+1)*(mid+1)>x){
                    return (int)mid;
                }else if((mid+1)*(mid+1)==x){
                    return (int)mid+1;
                }
                left=mid;
            }else if(mid*mid==x){
                return (int)mid;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
