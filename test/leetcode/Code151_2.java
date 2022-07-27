package leetcode;

import java.util.*;

//翻转字符串里的单词
public class Code151_2 {
    public static String reverseWords(String s) {
        s=s.trim();
        List<String> list= Arrays.asList(s.split("\\s+"));
        Collections.reverse(list);
        return String.join(" ",list);
    }

    public static void main(String[] args) {
        String str="a good   example";
        System.out.println(reverseWords(str));
    }
}
