package leetcode;

//最长回文字符串--解法有误，忽略即可
public class Code5_no {
    public static String longestPalindrome(String s) {
        char[] chars=s.toCharArray();
        //滑动的左右窗口坐标
        int left=0;
        int right=1;
        //最后确定的左右坐标
        int start=0;
        int end=1;
        //滑动窗口的长度
        int size=0;
        //是否是回文字符串
        boolean flag=false;
        while(right<chars.length){
            flag=isPalindrome(chars,left,right);
            if(flag){
                System.out.println("left:"+left);
                System.out.println("right:"+right);
                if(right-left>end-start){
                    start=left;
                    end=right;
                }
                if(left>0){
                    left--;
                }
                if(right<chars.length){
                    right++;
                }
            }else{
                System.out.println("else--left:"+left);
                System.out.println("else--right:"+right);
                if((right-left)%2==0){
                    left++;
                }
                if(right<chars.length){
                    right++;
                }
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=start;i<=end;i++){
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    public static boolean isPalindrome(char[] chars,int left,int right){
        while (left<right){
            if(chars[left]==chars[right]){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] chars=new char[]{'b','a','b','a','d'};
        String str="cbbd";
        System.out.println(isPalindrome(chars,0,1));
        System.out.println(longestPalindrome(str));
    }
}
