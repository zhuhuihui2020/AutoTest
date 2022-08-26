package leetcode;

import java.util.ArrayList;
import java.util.List;

//反转字符串中的元音字母
public class Code345 {
    public static String reverseVowels(String s) {
        char[] cs=s.toCharArray();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<cs.length;i++){
//            if(cs[i]=='a'||cs[i]=='A'||cs[i]=='e'||cs[i]=='E'||cs[i]=='i'||cs[i]=='I'||cs[i]=='o'||cs[i]=='O'||cs[i]=='u'||cs[i]=='U'){
//                list.add(i);
//            }
            if(isVowel(cs[i])){
                list.add(i);
            }
        }
        int left=0;
        int right=list.size()-1;
        while (left<right){
            char c=cs[list.get(left)];
            cs[list.get(left)]=cs[list.get(right)];
            cs[list.get(right)]=c;
            left++;
            right--;
        }
        return new String(cs);
    }

    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)>=0;
    }


    public static void main(String[] args) {
        String s="hello";
        System.out.println(reverseVowels(s));
    }
}
