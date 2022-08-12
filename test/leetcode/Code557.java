package leetcode;
//反转字符串中的单词 III
public class Code557 {
    public static String reverseWords(String s) {
        String[] strs=s.split(" ");
        for(int i=0;i<strs.length;i++){
            StringBuilder stringBuilder=new StringBuilder(strs[i]);
            stringBuilder.reverse();

            strs[i]=stringBuilder.toString();
        }
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<strs.length;i++){
            stringBuilder.append(strs[i]);
            if(i!=strs.length-1){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s="God Ding";
        System.out.println(reverseWords(s));
    }
}
