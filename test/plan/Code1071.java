package plan;

/**
 * 最大公因子
 *
 * 对于字符串 s 和 t，只有在 s = t + ... + t（t 自身连接 1 次或多次）时，我们才认定 “t 能除尽 s”。
 *
 * 给定两个字符串 str1 和 str2 。返回 最长字符串 x，要求满足 x 能除尽 str1 且 X 能除尽 str2 。
 */
public class Code1071 {
    public String gcdOfStrings(String str1, String str2) {
        int length=Math.min(str1.length(),str2.length());
        String s=(str1.length()>str2.length())?str2:str1;
        for(int i=length;i>0;i--){
            s=s.substring(0,i);
            if(check(str1,s)&&check(str2,s)){
               return s;
            }
        }
        return "";
    }

    public boolean check(String str,String s){
        StringBuilder sb=new StringBuilder(s);
        while (sb.length()<str.length()){
            if(sb.toString().equals(str)){
                return true;
            }
            sb.append(s);
        }
        return false;
    }
}
