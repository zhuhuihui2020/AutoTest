package leetcode;
//合并两个有序数组
public class Code88_2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            nums1[0]=nums2[0];
            return;
        }
        int max=0;
        int total=m+n-1;
        int tmp=0;
        while(n>0){
            if(nums1[m-1]
                    >nums2[n-1]){
                tmp=nums1[m-1];
                nums1[m-1]=nums1[total];
                nums1[total]=tmp;
                m--;
                System.out.println("111");
            }else{
                tmp=nums2[n-1];
                nums2[n-1]=nums1[total];
                nums1[total]=tmp;
                n--;
                System.out.println("222");
            }
            for(int i:nums1){
                System.out.println(i);
            }
            total--;
        }
    }

    public static void swap(int a,int b){
        int tmp;
        tmp=a;
        a=b;
        b=tmp;
    }

    public static void main(String[] args) {
//        int[] nums1=new int[]{2,0};
//        int[] nums2=new int[]{1};
        int[] nums1=new int[]{2,2,3,0,0,0,0};
        int[] nums2=new int[]{2,5,6,7};
        int n=nums2.length;
        int m=nums1.length-n;
        merge(nums1,m,nums2,n);
        for(int i:nums1){
            System.out.print(i+" ");
        }
    }
}
