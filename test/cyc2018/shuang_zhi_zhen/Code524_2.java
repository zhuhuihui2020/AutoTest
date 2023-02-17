package cyc2018.shuang_zhi_zhen;
/**
 * 给你一个字符串 s 和一个字符串数组 dictionary ，找出并返回 dictionary 中最长的字符串，该字符串可以通过删除 s 中的某些字符得到。
 *
 * 如果答案不止一个，返回长度最长且字母序最小的字符串。如果答案不存在，则返回空字符串。
 */
//双指针，把list集合遍历一遍，每个都判断一下是否满足条件
//双指针的基础上先排序，从长的到短的判断，这样满足条件就可以返回了
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Code524_2 {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()!=o2.length()){
                    return o2.length()-o1.length();
                }else {
                    return o1.compareTo(o2);
                }
            }
        });
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
                    return dic;
                }
            }
        }
        return str;
    }
}
