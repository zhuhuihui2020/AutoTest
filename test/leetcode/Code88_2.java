package leetcode;
//合并两个有序数组
public class Code88_2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int total=m+n-1;
        m=m-1;
        n=n-1;
        while(total>=0){
            if(m>=0&&n>=0){
                if(nums1[m]>nums2[n]){
                    nums1[total]=nums1[m];
                    m--;
                }else {
                    nums1[total]=nums2[n];
                    n--;
                }
            }else if(m<0&&n>=0){
                nums1[total]=nums2[n];
                n--;
            }else{
                //如果m>=0,n<0，说明nums2数组已经都添加添加到nums1数组后面了，nums1数组又是个有序数组，所以不用再排了
                return;
            }
            total--;
        }
    }

    public static void main(String[] args) {
        int[] nums1=new int[]{2,0};
        int[] nums2=new int[]{1};
        int n=nums2.length;
        int m=nums1.length-n;
        merge(nums1,m,nums2,n);
        for(int i:nums1){
            System.out.print(i+" ");
        }
    }
}
