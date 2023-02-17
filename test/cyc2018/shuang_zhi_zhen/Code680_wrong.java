package cyc2018.shuang_zhi_zhen;

/**
 * 给你一个字符串 s，最多 可以从中删除一个字符。
 *
 * 请你判断 s 是否能成为回文字符串：如果能，返回 true ；否则，返回 false 。
 */

/**
 * 本来的思路是双指针，遇到不一样的字符时，因为左右都可以删除，所以判断下一对是否相等，就删除哪个
 * 不过仔细思考了一下，自己就推翻了，因为很可能下一对都相等，但是只能删除左边或右边的才会成为回文字符串
 * 所以思路不对，代码也没有写全，不继续了
 * //            "abcdcdadcdba"
 * //            "abdcdadcdba"
 * //            "abcdcdadcba"
 */
public class Code680_wrong {
    public static boolean validPalindrome(String s) {
        char[] array=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        boolean flag=true;
        while (left<right){
            while (array[left]==array[right]&&left<right){
                left++;
                right--;
            }
            if(!flag&&array[left]!=array[right]&&left<right){
                return false;
            }
            if(array[left]!=array[right]){
                if(flag){
                if(array[left]==array[right-1]){
                    right--;
                    flag=false;
                }else if(array[left+1]==array[right]){
                    left++;
                    flag=false;
                }
            }
                left++;
                right--;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println(validPalindrome("abc"));
    }
}
