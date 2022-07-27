package leetcode;

import java.util.ArrayList;

//翻转字符串里的单词
public class Code151 {
    public static String reverseWords(String s) {
        char[] chars=s.toCharArray();
        int fast=0;
        int slow=0;
        ArrayList<StringBuilder> sbsList=new ArrayList<>();
        boolean flag=false;
        while(fast<chars.length){
            StringBuilder stringBuilder=new StringBuilder();
            while (fast<chars.length&&chars[fast]!=' '){
                fast++;
                flag=true;
            }
            for(;slow<fast;slow++){
                stringBuilder.append(chars[slow]);
            }
            if(flag){
                sbsList.add(stringBuilder);
            }
            while(fast<chars.length&&chars[fast]==' '){
                fast++;
                slow++;
                flag=false;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=sbsList.size()-1;i>=0;i--){
            sb.append(sbsList.get(i));
            if(i!=0){
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="  the sky is blue  ";
        System.out.println(reverseWords(str));
    }
}
