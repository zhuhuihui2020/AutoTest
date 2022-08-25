package leetcode;
//验证回文串
import java.util.Locale;

/**
 * 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。
 * 则可以认为该短语是一个回文串。
 * 字母和数字都属于字母数字字符。
 * 给你一个字符串 s，如果它是回文串，返回 true ；否则，返回 false 。
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出：true
 * 解释："amanaplanacanalpanama" 是回文串。
 */
public class Code125{
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char[] cs=s.toCharArray();
        int left=0;
        int right=cs.length-1;
        while (left<right){
            while (!Character.isDigit(cs[left])&&!Character.isLetter(cs[left])){
                if(left<right){
                    left++;
                }else {
                    break;
                }
            }
            while (!Character.isDigit(cs[right])&&!Character.isLetter(cs[right])){
                if(left<right){
                    right--;
                }else{
                    break;
                }
            }
            if(cs[left]!=cs[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s=";.;";
        System.out.println(isPalindrome(s));
    }
}
