package cyc2018.shuang_zhi_zhen;
/**
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */
//双指针，非递减顺序排列，所以需要从尾部开始排，将数值更大的从后往前排列
public class Code88_2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int total=m+n-1;
        m=m-1;
        n=n-1;
        while (total>=0){
            if (m>=0&&n>=0){
                if (nums1[m]>=nums2[n]){
                    nums1[total--]=nums1[m--];
                }else if(nums1[m]<nums2[n]){
                    nums1[total--]=nums2[n--];
                }
            } else if(m<0&&n>=0){
                nums1[total--]=nums2[n--];
            }else if(n<0&&m>=0){
                //nums2已经排完了，只剩下nums1了
                return;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] num1=new int[]{0};
        int[] num2=new int[]{1};
        int m=0;
        int n=1;
        merge(num1,m,num2,n);
        for(int i:num1){
            System.out.println(i);
        }
    }
}
