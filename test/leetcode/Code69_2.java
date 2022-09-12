package leetcode;
//x的平方根
//官方的二分查找
public class Code69_2 {
    public static int mySqrt(int x) {
        int left=0;
        int right=x;
        int ans=-1;
        while (left<=right){
            int mid=(left+right)/2;
            if((long)mid*mid<=x){
                ans=mid;
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
