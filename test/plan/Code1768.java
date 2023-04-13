package plan;

/**
 * 给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。
 * 如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
 *
 * 返回 合并后的字符串 。
 */

public class Code1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int length1=word1.length();
        int length2=word2.length();
        int num1=0;
        int num2=0;
        while (num1<length1||num2<length2){
            if(num1<length1&&num2<length2){
                sb.append(word1.charAt(num1));
                sb.append(word2.charAt(num2));
                num1++;
                num2++;
            }else if(num1==length1&&num2<length2){
                while (num2<length2){
                    sb.append(word2.charAt(num2));
                    num2++;
                }
            }else {
                while (num1<length1){
                    sb.append(word1.charAt(num1));
                    num1++;
                }
            }
        }
        return sb.toString();
    }

}
