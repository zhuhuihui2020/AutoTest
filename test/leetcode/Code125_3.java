package leetcode;
//验证回文串
public class Code125_3 {
    public static boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder();
        char[] cs=s.toCharArray();
        for(char c:cs){
            if(Character.isLetterOrDigit(c)){
                //转成小写的再append
                sb.append(Character.toLowerCase(c));
            }
        }
        //主要是这一步，需要new出来一个新的StringBuilder再反转
        StringBuilder sb2=new StringBuilder(sb).reverse();
        return sb.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
