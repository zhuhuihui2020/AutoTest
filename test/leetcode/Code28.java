package leetcode;
//实现 strStr()
public class Code28 {
    public static int strStr(String haystack, String needle) {
        if(needle==null){
            return 0;
        }
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack="aaaaa";
        String needle="bba";
        System.out.println(strStr(haystack,needle));
    }
}
