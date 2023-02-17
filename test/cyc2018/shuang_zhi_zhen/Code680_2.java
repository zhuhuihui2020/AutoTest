package cyc2018.shuang_zhi_zhen;

/**
 * 给你一个字符串 s，最多 可以从中删除一个字符。
 *
 * 请你判断 s 是否能成为回文字符串：如果能，返回 true ；否则，返回 false 。
 */
//简洁一下双指针的代码
public class Code680_2 {
    public static boolean validPalindrome(String s) {
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return isvalidPalindrome(s,i+1,j)||isvalidPalindrome(s,i,j-1);
            }
        }
        return true;
    }

    public static boolean isvalidPalindrome(String s,int i,int j){
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("abcdcdadcdba"));
    }
}
