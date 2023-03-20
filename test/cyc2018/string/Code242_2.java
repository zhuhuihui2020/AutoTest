package cyc2018.string;
/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 */
public class Code242_2 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        int length1=s.length();
        int length2=t.length();
        for(int i=0;i<length1;i++){
            arr1[s.charAt(i)-'a']++;
        }
        for(int j=0;j<length2;j++){
            arr2[t.charAt(j)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
