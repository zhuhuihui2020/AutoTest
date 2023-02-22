package cyc2018.shuang_zhi_zhen;

public class Code69_2 {
    public static int mySqrt(int x) {
        int left=0;
        int right=x;
        int ans=-1;
        while (left<=right){
            int middle=left+(right-left)/2;
            if((long)middle*middle==x){
                return middle;
            }else if((long)middle*middle<x){
                ans=middle;
                left=middle+1;
            }else {
                right=middle-1;
            }
        }
        return ans;
    }


}
