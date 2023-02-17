package cyc2018.shuang_zhi_zhen;
/**
 * 给你一个字符串 s 和一个字符串数组 dictionary ，找出并返回 dictionary 中最长的字符串，该字符串可以通过删除 s 中的某些字符得到。
 *
 * 如果答案不止一个，返回长度最长且字母序最小的字符串。如果答案不存在，则返回空字符串。
 */
//双指针，把list集合遍历一遍，每个都判断一下是否满足条件
import java.util.List;

public class Code524 {
    public String findLongestWord(String s, List<String> dictionary) {
        String str="";
        for(String dic:dictionary){
            //i指向s
            int i=0;
            //j指向list中的元素
            int j=0;
            while (j<dic.length()&&i<s.length()){
                if(s.charAt(i)==dic.charAt(j)){
                    j++;
                }
                i++;
                //j走到了最后，说明dic是s的子串
                if(j==dic.length()){
                    //判断返回长度最长且字母序最小的字符串
                    if(str.length()<dic.length()||(str.length()==dic.length()&&str.compareTo(dic)>0)){
                        str=dic;
                    }
                }
            }
        }
        return str;
    }
}
