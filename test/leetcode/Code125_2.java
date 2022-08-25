package leetcode;
//验证回文串
public class Code125_2 {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char[] cs=s.toCharArray();
        int left=0;
        int right=cs.length-1;
        while (left<right){
            while (left<right&&!Character.isLetterOrDigit(cs[left])){
                left++;
            }
            while (left<right&&!Character.isLetterOrDigit(cs[right])){
                right--;
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
