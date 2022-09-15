package leetcode;
//3 的幂
//二分法
public class Code326_2 {
    public boolean isPowerOfThree(int n) {
        int left=0;
        int right=n;
        while (left<=right){
            int mid=(left+right)/2;
            if(Math.pow(3,mid)>n){
                right=mid-1;
            }else if(Math.pow(3,mid)<n){
                left=mid+1;
            }else {
                return true;
            }
        }
        return false;
    }
}
