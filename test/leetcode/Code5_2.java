package leetcode;

//最长回文字符串
public class Code5_2 {
    public static String longestPalindrome(String s) {
        char[] charArray=s.toCharArray();
        int left;
        int length=s.length();
        //滑动窗口的大小
        int size=s.length();
        //从最大字符串开始判断，判断回文字符串，左右两端，一起往右移动
        while (size>0){
            left=0;
            //while先判断后执行，do while是先执行后判断
            //do while总是保证循环体会被至少执行一次
            do{
                if(isPalindrome(charArray,left,left+size-1)){
                    return s.substring(left,left+size);
                }
                left++;
            }while (left+size<=length);
            size--;
        }
        return "";
    }

    //判断是否是回文字符串
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
        String str="ab";
//        System.out.println(isPalindrome(chars,0,1));
        System.out.println(longestPalindrome(str));
    }
}
