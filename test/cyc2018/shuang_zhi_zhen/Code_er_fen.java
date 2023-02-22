package cyc2018.shuang_zhi_zhen;

/**
 * 二分查找
 * Input : [1,2,3,4,5]
 * key : 3
 * return the index : 2
 */
public class Code_er_fen {
    public static int binarySearch(int[] nums, int key) {
        int left=0;
        int right=nums.length;
        while (left<=right){
            //l + h 可能出现加法溢出，也就是说加法的结果大于整型能够表示的范围。
            // 但是 l 和 h 都为正数，因此 h - l 不会出现加法溢出问题。所以，最好使用第二种计算法方法。
//            int middle=(left+right)/2;
            int middle=left+(right-left)/2;
            if(nums[middle]==key){
                return middle;
            }else if(nums[middle]<key){
                left=middle+1;
            }else{
                right=middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array=new int[]{0,1,2};
        System.out.println(binarySearch(array,1));

    }
}
