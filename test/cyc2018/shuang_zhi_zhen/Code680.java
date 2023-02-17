package cyc2018.shuang_zhi_zhen;

/**
 * 给你一个字符串 s，最多 可以从中删除一个字符。
 *
 * 请你判断 s 是否能成为回文字符串：如果能，返回 true ；否则，返回 false 。
 */
//双指针
public class Code680 {
    public static boolean validPalindrome(String s) {
        char[] array=s.toCharArray();
        int left=0;
        int right=array.length-1;
        while (left<right){
            if (array[left]==array[right]){
                left++;
                right--;
            }else{
                if(isvalidPalindrome(array,left+1,right)||isvalidPalindrome(array,left,right-1)){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isvalidPalindrome(char[] array,int left,int right){
        while (left<right){
            if(array[left]!=array[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("abcdcdadcdba"));
    }
}
